package net.trollyloki.hypixelapiwrapper.objects.achievements;

import com.google.gson.JsonObject;

public class Tier {

	private final int tier, points, amount;

	public Tier(JsonObject object) {
		this.tier = object.get("tier").getAsInt();
		this.points = object.get("points").getAsInt();
		this.amount = object.get("amount").getAsInt();
	}

	public int getTier() {
		return tier;
	}

	public int getPoints() {
		return points;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Tier{tier=" + tier + ", points=" + points + ", amount=" + amount + "}";
	}

}
