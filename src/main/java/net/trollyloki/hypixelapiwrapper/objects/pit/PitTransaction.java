package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.Date;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitTransaction extends APIObject {

	private final int amount;
	private final Date timestamp;

	public PitTransaction(HypixelAPIWrapper api, JsonObject object) {
		super(api);
		this.amount = object.get("amount").getAsInt();
		this.timestamp = new Date(object.get("timestamp").getAsLong());
	}

	public int getAmount() {
		return amount;
	}

	public Date getTimestamp() {
		return (Date) timestamp.clone();
	}

	@Override
	public String toString() {
		return "PitTransaction{amount=" + amount + ", timestamp=" + timestamp + "}";
	}

}
