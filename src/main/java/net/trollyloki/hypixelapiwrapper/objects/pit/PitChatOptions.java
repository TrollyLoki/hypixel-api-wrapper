package net.trollyloki.hypixelapiwrapper.objects.pit;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public class PitChatOptions extends APIObject {

	private final boolean bounties, streaks, prestige, minorEvents, killFeed, playerChat, miscellaneous;

	public PitChatOptions(HypixelAPIWrapper api, JsonObject object) {
		super(api);
		this.bounties = Utils.getAsBooleanOrDefault(object.get("chat_option_bounties"), true);
		this.streaks = Utils.getAsBooleanOrDefault(object.get("chat_option_streaks"), true);
		this.prestige = Utils.getAsBooleanOrDefault(object.get("chat_option_prestige_announcements"), true);
		this.minorEvents = Utils.getAsBooleanOrDefault(object.get("chat_option_minor_events"), true);
		this.killFeed = Utils.getAsBooleanOrDefault(object.get("chat_option_kill_feed"), true);
		this.playerChat = Utils.getAsBooleanOrDefault(object.get("chat_option_player_chat"), true);
		this.miscellaneous = Utils.getAsBooleanOrDefault(object.get("chat_option_misc"), true);
	}

	public boolean isBounties() {
		return bounties;
	}

	public boolean isStreaks() {
		return streaks;
	}

	public boolean isPrestige() {
		return prestige;
	}

	public boolean isMinorEvents() {
		return minorEvents;
	}

	public boolean isKillFeed() {
		return killFeed;
	}

	public boolean isPlayerChat() {
		return playerChat;
	}

	public boolean isMiscellaneous() {
		return miscellaneous;
	}

	@Override
	public String toString() {
		return "PitChatOptions{bounties=" + bounties + ", streaks=" + streaks + ", prestige=" + prestige
				+ ", minorEvents=" + minorEvents + ", killFeed=" + killFeed + ", playerChat=" + playerChat
				+ ", miscellaneous=" + miscellaneous + "}";
	}

}
