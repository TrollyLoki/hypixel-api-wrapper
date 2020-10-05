package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.Date;
import java.util.UUID;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitBounty extends APIObject {

	private final UUID issuer;
	private final int amount, remainingTicks;
	private final Date timestamp;

	public PitBounty(HypixelAPIWrapper api, JsonObject object) {
		super(api);
		this.issuer = UUID.fromString(Utils.addDashesToUuid(object.get("issuer").getAsString()));
		this.amount = object.get("amount").getAsInt();
		this.remainingTicks = object.get("remainingTicks").getAsInt();
		this.timestamp = new Date(object.get("timestamp").getAsLong());
	}

	public UUID getIssuer() {
		return issuer;
	}

	public int getAmount() {
		return amount;
	}

	public int getRemainingTicks() {
		return remainingTicks;
	}

	public Date getTimestamp() {
		return (Date) timestamp.clone();
	}

	@Override
	public String toString() {
		return "PitBounty{issuer=" + issuer + ", amount=" + amount + ", remainingTicks=" + remainingTicks
				+ ", timestamp=" + timestamp + "}";
	}

}
