package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.Date;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitPrestigeInfo extends APIObject {

	private final int index, xpOnPrestige;
	private final double goldDuringPrestige;
	private final Date timestamp;

	public PitPrestigeInfo(HypixelAPIWrapper api, JsonObject object, double goldDuringPrestige) {
		super(api);
		this.index = object.get("index").getAsInt();
		this.xpOnPrestige = object.get("xp_on_prestige").getAsInt();
		this.goldDuringPrestige = goldDuringPrestige;
		this.timestamp = new Date(object.get("timestamp").getAsLong());
	}

	public int getIndex() {
		return index;
	}

	public int getXpOnPrestige() {
		return xpOnPrestige;
	}

	public double getGoldDuringPrestige() {
		return goldDuringPrestige;
	}

	public Date getTimestamp() {
		return (Date) timestamp.clone();
	}

	@Override
	public String toString() {
		return "PitPrestigeInfo{index=" + index + ", xpOnPrestige=" + xpOnPrestige + ", goldDuringPrestige="
				+ goldDuringPrestige + ", timestamp=" + timestamp + "}";
	}

}
