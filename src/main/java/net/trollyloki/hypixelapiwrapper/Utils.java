package net.trollyloki.hypixelapiwrapper;

import java.awt.Color;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.querz.nbt.io.NBTDeserializer;
import net.querz.nbt.io.NamedTag;
import net.querz.nbt.tag.CompoundTag;
import net.querz.nbt.tag.ListTag;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;
import net.trollyloki.hypixelapiwrapper.objects.inventory.Inventory;
import net.trollyloki.hypixelapiwrapper.objects.inventory.Item;

public class Utils {

	public static String addDashesToUuid(String uuid) {
		StringBuilder builder = new StringBuilder(uuid);
		builder.insert(8, '-');
		builder.insert(12, '-');
		builder.insert(16, '-');
		builder.insert(20, '-');
		return builder.toString();
	}

	public static String[] convertJsonArrayToStringArray(JsonArray json) {
		String[] array = new String[json.size()];
		for (int i = 0; i < json.size(); i++)
			array[i] = json.get(i).getAsString();
		return array;
	}

	public static byte[] convertJsonArrayToByteArray(JsonArray json) {
		byte[] array = new byte[json.size()];
		for (int i = 0; i < json.size(); i++)
			array[i] = json.get(i).getAsByte();
		return array;
	}

	public static boolean getAsBooleanOrDefault(JsonElement element, boolean def) {
		return element != null ? element.getAsBoolean() : def;
	}

	public static int getAsIntOrDefault(JsonElement element, int def) {
		return element != null ? element.getAsInt() : def;
	}

	public static double getAsDoubleOrDefault(JsonElement element, double def) {
		return element != null ? element.getAsDouble() : def;
	}

	public static String getAsStringOrDefault(JsonElement element, String def) {
		return element != null ? element.getAsString() : def;
	}

	public static Date getAsDateOrDefault(JsonElement element, Date def) {
		return element != null ? new Date(element.getAsLong()) : def;
	}

	public static Color getAsColorOrDefault(JsonElement element, Color def) {
		return element != null ? new Color(element.getAsInt()) : def;
	}

	public static boolean getAsBooleanOrDefault(CompoundTag tag, String key, boolean def) {
		return tag.containsKey(key) ? tag.getBoolean(key) : def;
	}

	public static int getAsIntOrDefault(CompoundTag tag, String key, int def) {
		return tag.containsKey(key) ? tag.getInt(key) : def;
	}

	public static double getAsDoubleOrDefault(CompoundTag tag, String key, double def) {
		return tag.containsKey(key) ? tag.getDouble(key) : def;
	}

	public static String getAsStringOrDefault(CompoundTag tag, String key, String def) {
		return tag.containsKey(key) ? tag.getString(key) : def;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Enum<T>> T getAsEnumOrDefault(JsonElement element, T def, Class<T> clazz) {
		if (element == null)
			return def;

		try {
			return (T) clazz.getDeclaredMethod("valueOf", String.class).invoke(null, element.getAsString());
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static <T extends Enum<T>> T getAsEnumOrDefault(JsonElement element, T def) {
		return getAsEnumOrDefault(element, def, def.getDeclaringClass());
	}

	public static <T extends Enum<T>> T getAsEnumOrDefaultNull(JsonElement element, Class<T> clazz) {
		return getAsEnumOrDefault(element, null, clazz);
	}

	public static List<String> getAsStringList(JsonElement element) {
		List<String> list = new ArrayList<>();
		if (element != null && element.isJsonArray())
			for (JsonElement e : element.getAsJsonArray())
				list.add(e.getAsString());
		return list;
	}

	public static List<Date> getAsDateList(JsonElement element) {
		List<Date> list = new ArrayList<>();
		if (element != null && element.isJsonArray())
			for (JsonElement e : element.getAsJsonArray())
				list.add(new Date(e.getAsLong()));
		return list;
	}

	public static <T extends APIObject> List<T> getAsObjectList(HypixelAPIWrapper api, JsonElement element,
			Class<T> clazz) {
		List<T> list = new ArrayList<>();
		if (element != null && element.isJsonArray())
			for (JsonElement e : element.getAsJsonArray()) {
				try {
					list.add(clazz.getConstructor(HypixelAPIWrapper.class, JsonObject.class).newInstance(api,
							e.getAsJsonObject()));
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException e1) {
					e1.printStackTrace();
				}
			}
		return list;
	}

	public static Map<String, Integer> getAsIntMap(JsonElement element) {
		Map<String, Integer> map = new HashMap<>();
		if (element != null && element.isJsonObject())
			for (Entry<String, JsonElement> entry : element.getAsJsonObject().entrySet())
				map.put(entry.getKey(), entry.getValue().getAsInt());
		return map;
	}

	public static NamedTag readNBT(JsonObject object, boolean compressed) throws IOException {
		if (object == null)
			return null;
		return new NBTDeserializer(compressed)
				.fromBytes(Utils.convertJsonArrayToByteArray(object.getAsJsonArray("data")));
	}

	@SuppressWarnings("unchecked")
	public static <T extends Item> Inventory<T> getAsInventory(HypixelAPIWrapper api, JsonElement element,
			Class<T> clazz) {
		if (element == null || !element.isJsonObject())
			return null;

		try {
			CompoundTag tag = (CompoundTag) readNBT(element.getAsJsonObject(), true).getTag();
			return new Inventory<T>(api, (ListTag<CompoundTag>) tag.getListTag("i"), clazz);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
