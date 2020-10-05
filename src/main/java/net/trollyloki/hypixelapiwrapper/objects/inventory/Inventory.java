package net.trollyloki.hypixelapiwrapper.objects.inventory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import net.querz.nbt.tag.CompoundTag;
import net.querz.nbt.tag.ListTag;
import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class Inventory<T extends Item> extends APIObject {

	private final List<T> items;

	public Inventory(HypixelAPIWrapper api, ListTag<CompoundTag> list, Class<T> clazz) {
		super(api);

		this.items = new ArrayList<>();
		for (CompoundTag tag : list) {
			if (tag.size() > 0) {
				try {
					items.add(clazz.getConstructor(HypixelAPIWrapper.class, CompoundTag.class).newInstance(api, tag));
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public List<T> getItems() {
		return new ArrayList<>(items);
	}

	@Override
	public String toString() {
		return "Inventory{items=" + items + "}";
	}

}
