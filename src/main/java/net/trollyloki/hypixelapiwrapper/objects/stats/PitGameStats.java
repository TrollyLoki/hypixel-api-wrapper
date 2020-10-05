package net.trollyloki.hypixelapiwrapper.objects.stats;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;
import net.trollyloki.hypixelapiwrapper.enums.pit.PitStat;
import net.trollyloki.hypixelapiwrapper.objects.pit.PitProfile;

public class PitGameStats extends GameStats {

	private final PitProfile profile;
	private final Map<PitStat, Integer> stats;
	private final Date statsMove1;

	public PitGameStats(HypixelAPIWrapper api, JsonObject object) {
		super(api, Game.PIT);
		this.profile = new PitProfile(api, object.getAsJsonObject("profile"));
		this.stats = new HashMap<>();
		for (Entry<String, JsonElement> entry : object.getAsJsonObject("pit_stats_ptl").entrySet())
			stats.put(PitStat.valueOf(entry.getKey().toUpperCase()), entry.getValue().getAsInt());
		this.statsMove1 = object.has("stats_move_1") ? new Date(object.get("stats_move_1").getAsLong()) : null;
	}

	public PitProfile getProfile() {
		return profile;
	}

	public Map<PitStat, Integer> getStats() {
		return new HashMap<>(stats);
	}

	public int getStats(PitStat stat) {
		return stats.get(stat);
	}

	public Date getStatsMove1() {
		if (statsMove1 == null)
			return null;
		return (Date) statsMove1.clone();
	}

	@Override
	public String toString() {
		return "PitGameStats{profile=" + profile + ", stats=" + stats + ", statsMove1=" + statsMove1 + "}";
	}

}
