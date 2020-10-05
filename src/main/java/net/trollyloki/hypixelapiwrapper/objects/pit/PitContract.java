package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.enums.pit.PitContractDifficulty;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitContract extends APIObject {

	private final PitContractDifficulty difficulty;
	private final String key;

	private final int goldReward, chunkOfVilesReward;

	private final Date completionDate;
	private final int remainingTicks;

	private final Map<String, Integer> requirements, progress;

	public PitContract(HypixelAPIWrapper api, JsonObject object) {
		super(api);

		this.difficulty = PitContractDifficulty.valueOf(object.get("difficulty").getAsString());
		this.key = object.get("key").getAsString();

		this.goldReward = object.get("gold_reward").getAsInt();
		this.chunkOfVilesReward = Utils.getAsIntOrDefault(object.get("chunk_of_viles_reward"), 0);

		this.completionDate = new Date(object.get("completion_date").getAsLong());
		this.remainingTicks = object.get("remaining_ticks").getAsInt();

		this.requirements = new HashMap<>();
		for (Entry<String, JsonElement> element : object.getAsJsonObject("requirements").entrySet())
			requirements.put(element.getKey(), element.getValue().getAsInt());
		this.progress = new HashMap<>();
		for (Entry<String, JsonElement> element : object.getAsJsonObject("progress").entrySet())
			progress.put(element.getKey(), element.getValue().getAsInt());
	}

	public PitContractDifficulty getDifficulty() {
		return difficulty;
	}

	public String getKey() {
		return key;
	}

	public int getGoldReward() {
		return goldReward;
	}

	public int getChunkOfVilesReward() {
		return chunkOfVilesReward;
	}

	public Date getCompletionDate() {
		return (Date) completionDate.clone();
	}

	public int getRemainingTicks() {
		return remainingTicks;
	}

	public Map<String, Integer> getRequirements() {
		return new HashMap<>(requirements);
	}

	public Map<String, Integer> getProgress() {
		return new HashMap<>(progress);
	}

	@Override
	public String toString() {
		return "PitContract{difficulty=" + difficulty + ", key=" + key + ", goldReward=" + goldReward
				+ ", chunkOfVilesReward=" + chunkOfVilesReward + ", completionDate=" + completionDate
				+ ", remainingTicks=" + remainingTicks + ", requirements=" + requirements + ", progress=" + progress
				+ "}";
	}

}
