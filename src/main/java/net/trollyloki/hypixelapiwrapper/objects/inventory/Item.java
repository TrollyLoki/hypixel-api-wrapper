package net.trollyloki.hypixelapiwrapper.objects.inventory;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import net.querz.nbt.tag.CompoundTag;
import net.querz.nbt.tag.StringTag;
import net.querz.nbt.tag.Tag;
import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.enums.ItemType;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class Item extends APIObject {

	private final ItemType type;
	private final byte count;

	private final int hideFlags;
	private final boolean unbreakable;

	private final String name;
	private final List<String> lore;
	private final Color color;

	protected final CompoundTag metaTag;
	protected final CompoundTag extraAttributes;

	public Item(HypixelAPIWrapper api, CompoundTag tag) {
		super(api);

		this.type = ItemType.getById(tag.getShort("id"), tag.getShort("Damage"));
		this.count = tag.getByte("Count");

		this.metaTag = tag.getCompoundTag("tag");
		if (metaTag != null) {
			this.hideFlags = Utils.getAsIntOrDefault(metaTag, "HideFlags", 0);
			this.unbreakable = Utils.getAsBooleanOrDefault(metaTag, "Unbreakable", false);

			CompoundTag display = metaTag.getCompoundTag("display");
			if (display != null) {
				this.name = display.getString("Name");
				this.lore = new ArrayList<>();
				if (display.containsKey("Lore"))
					for (Tag<?> line : display.getListTag("Lore")) {
						this.lore.add(((StringTag) line).getValue());
					}
				this.color = display.containsKey("color") ? new Color(display.getInt("color")) : null;
			} else {
				this.name = null;
				this.lore = new ArrayList<>();
				this.color = null;
			}

			this.extraAttributes = metaTag.getCompoundTag("ExtraAttributes");
		} else {
			this.hideFlags = 0;
			this.unbreakable = false;

			this.name = null;
			this.lore = new ArrayList<>();
			this.color = null;

			this.extraAttributes = null;
		}
	}

	public ItemType getType() {
		return type;
	}

	public byte getCount() {
		return count;
	}

	public int getHideFlags() {
		return hideFlags;
	}

	public boolean isUnbreakable() {
		return unbreakable;
	}

	public String getName() {
		return name;
	}

	public List<String> getLore() {
		return new ArrayList<>(lore);
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Item{type=" + type + ", count=" + count + ", hideFlags=" + hideFlags + ", unbreakable=" + unbreakable
				+ ", name=" + name + ", lore=" + lore + ", color=" + color + ", extraAttributes=" + extraAttributes
				+ "}";
	}

}
