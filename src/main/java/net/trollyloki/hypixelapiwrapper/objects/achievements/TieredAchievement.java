package net.trollyloki.hypixelapiwrapper.objects.achievements;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;

public class TieredAchievement extends Achievement {

	private final List<Tier> tiers;

	public TieredAchievement(HypixelAPIWrapper api, Game game, String id, JsonObject object) {
		super(api, game, id, object);

		this.tiers = new ArrayList<>();
		for (JsonElement element : object.get("tiers").getAsJsonArray()) {
			tiers.add(new Tier(element.getAsJsonObject()));
		}
	}

	public List<Tier> getTiers() {
		return new ArrayList<>(tiers);
	}

	@Override
	public String toString() {
		return "TieredAchievement{game=" + game + ", id=" + id + "}";
	}

}
