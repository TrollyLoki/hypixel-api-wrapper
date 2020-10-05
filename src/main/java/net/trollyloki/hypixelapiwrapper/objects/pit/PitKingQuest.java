package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.Date;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitKingQuest extends APIObject {

	private final int kills, renown;
	private final Date lastAccepted, lastCompleted;

	public PitKingQuest(HypixelAPIWrapper api, JsonObject object) {
		super(api);
		this.kills = Utils.getAsIntOrDefault(object.get("kills"), 0);
		this.renown = Utils.getAsIntOrDefault(object.get("renown"), 0);
		this.lastAccepted = Utils.getAsDateOrDefault(object.get("last_accepted"), null);
		this.lastCompleted = Utils.getAsDateOrDefault(object.get("last_completed"), null);
	}

	public int getKills() {
		return kills;
	}

	public int getRenown() {
		return renown;
	}

	public Date getLastAccepted() {
		if (lastAccepted == null)
			return null;
		return (Date) lastAccepted.clone();
	}

	public Date getLastCompleted() {
		if (lastCompleted == null)
			return null;
		return (Date) lastCompleted.clone();
	}

	@Override
	public String toString() {
		return "PitKingQuest{kills=" + kills + ", renown=" + renown + ", lastAccepted=" + lastAccepted + "}";
	}

}
