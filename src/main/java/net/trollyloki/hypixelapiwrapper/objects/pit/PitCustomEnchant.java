package net.trollyloki.hypixelapiwrapper.objects.pit;

import net.querz.nbt.tag.CompoundTag;
import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitCustomEnchant extends APIObject {

	private final String key;
	private final int level;
	private final int version;

	public PitCustomEnchant(HypixelAPIWrapper api, CompoundTag tag) {
		super(api);

		this.key = tag.getString("Key");
		this.level = tag.getInt("Level");
		this.version = tag.containsKey("Version") ? tag.getInt("Version") : 1;
	}

	public String getKey() {
		return key;
	}

	public int getLevel() {
		return level;
	}

	public int getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "PitCustomEnchant{key=" + key + ", level=" + level + ", version=" + version + "}";
	}

}
