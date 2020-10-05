package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.enums.pit.PitGenesisAllegiance;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitGenesisInfo extends APIObject {

	private final PitGenesisAllegiance allegiance;
	private final Date allegianceTime;
	private final int points;
	private final boolean spawnInBase;
	private final Map<PitGenesisAllegiance, Date> lastClaimedItem;

	public PitGenesisInfo(HypixelAPIWrapper api, JsonObject object) {
		super(api);

		this.allegiance = Utils.getAsEnumOrDefaultNull(object.get("genesis_allegiance"), PitGenesisAllegiance.class);
		this.allegianceTime = Utils.getAsDateOrDefault(object.get("genesis_allegiance_time"), null);

		this.points = Utils.getAsIntOrDefault(object.get("genesis_points"), 0);
		this.spawnInBase = Utils.getAsBooleanOrDefault(object.get("genesis_spawn_in_base"), false);

		this.lastClaimedItem = new HashMap<>();
		if (object.has("genesis_weekly_perks_claim_item_angel"))
			lastClaimedItem.put(PitGenesisAllegiance.ANGEL,
					new Date(object.get("genesis_weekly_perks_claim_item_angel").getAsLong()));
		if (object.has("genesis_weekly_perks_claim_item_demon"))
			lastClaimedItem.put(PitGenesisAllegiance.DEMON,
					new Date(object.get("genesis_weekly_perks_claim_item_demon").getAsLong()));
	}

	public PitGenesisAllegiance getAllegiance() {
		return allegiance;
	}

	public Date getAllegianceTime() {
		if (allegianceTime == null)
			return null;
		return (Date) allegianceTime.clone();
	}

	public int getPoints() {
		return points;
	}

	public boolean isSpawnInBase() {
		return spawnInBase;
	}

	public Date getLastClaimedItem(PitGenesisAllegiance allegiance) {
		if (!lastClaimedItem.containsKey(allegiance))
			return null;
		return (Date) lastClaimedItem.get(allegiance).clone();
	}

	@Override
	public String toString() {
		return "PitGenesisInfo{allegiance=" + allegiance + ", allegianceTime=" + allegianceTime + ", points=" + points
				+ ", spawnInBase=" + spawnInBase + ", lastClaimedItem=" + lastClaimedItem + "}";
	}

}
