package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.Date;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitUnlock extends APIObject {

	private final String key;
	private final int tier;
	private final Date acquireDate;

	public PitUnlock(HypixelAPIWrapper api, JsonObject object) {
		super(api);
		this.key = object.get("key").getAsString();
		this.tier = object.get("tier").getAsInt();
		this.acquireDate = new Date(object.get("acquireDate").getAsLong());
	}

	public String getKey() {
		return key;
	}

	public int getTier() {
		return tier;
	}

	public Date getAcquireDate() {
		return (Date) acquireDate.clone();
	}

	@Override
	public String toString() {
		return "PitUnlock{key=" + key + ", tier=" + tier + ", acquireDate=" + acquireDate + "}";
	}

}
