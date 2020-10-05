package net.trollyloki.hypixelapiwrapper.objects.achievements;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;

public class OneTimeAchievement extends Achievement {

	private final int points;
	private final double gamePercentUnlocked, globalPercentUnlocked;

	public OneTimeAchievement(HypixelAPIWrapper api, Game game, String id, JsonObject object) {
		super(api, game, id, object);

		this.points = object.get("points").getAsInt();
		if (object.has("gamePercentUnlocked"))
			this.gamePercentUnlocked = object.get("gamePercentUnlocked").getAsDouble();
		else
			this.gamePercentUnlocked = 0;
		this.globalPercentUnlocked = object.get("globalPercentUnlocked").getAsDouble();
	}

	public int getPoints() {
		return points;
	}

	public double getGamePercentUnlocked() {
		return gamePercentUnlocked;
	}

	public double getGlobalPercentUnlocked() {
		return globalPercentUnlocked;
	}

	@Override
	public String toString() {
		return "OneTimeAchievement{game=" + game + ", id=" + id + "}";
	}

}
