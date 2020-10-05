package net.trollyloki.hypixelapiwrapper.objects;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.enums.PrivacyLevel;
import net.trollyloki.hypixelapiwrapper.enums.ProfanityLevel;
import net.trollyloki.hypixelapiwrapper.enums.QualityLevel;

public class PlayerSettings extends APIObject {

	private final boolean autoQueue;
	private final boolean updateNotifications;
	private final QualityLevel particleQuality;
	private final boolean offerMapFeedback;
	private final boolean autoTip;
	private final boolean bloodVisibility;
	private final boolean slashLobbyProtection;

	private final boolean chatVisibility;
	private final boolean guildChatVisibility;
	private final boolean lobbyJoinMessage;

	private final ProfanityLevel publicProfanityLevel;
	private final ProfanityLevel partyProfanityLevel;
	private final ProfanityLevel guildProfanityLevel;
	private final ProfanityLevel privateMessageProfanityLevel;

	private final boolean partyMessageSounds;
	private final boolean guildMessageSounds;
	private final boolean privateMessageSounds;
	private final boolean chatAlerts;

	private final PrivacyLevel privateMessagePrivacy;
	private final PrivacyLevel friendRequestPrivacy;
	private final PrivacyLevel duelInvitePrivacy;
	@Deprecated
	private final PrivacyLevel bridgeChallengePrivacy;
	private final PrivacyLevel partyInvitePrivacy;
	private final PrivacyLevel guildInvitePrivacy;

	private final boolean playerVisibility;
	private final boolean petVisibility;
	private final boolean autoSpawnPet;
	private final boolean lobbyDarkMode;

	private final boolean apiOnlineStatus;
	private final boolean apiRecentGames;

	private final int spectatorSpeed;
	private final boolean spectatorAutoTeleport;
	private final boolean spectatorFirstPerson;
	private final boolean spectatorNightVision;
	private final boolean spectatorHideSpectators;

	public PlayerSettings(HypixelAPIWrapper api, JsonObject object) {
		super(api);

		this.autoQueue = Utils.getAsBooleanOrDefault(object.get("autoQueue"), true);
		this.updateNotifications = Utils.getAsBooleanOrDefault(object.get("newsPopup"), true);
		this.particleQuality = Utils.getAsEnumOrDefault(object.get("particleQuality"), QualityLevel.HIGH);
		this.offerMapFeedback = Utils.getAsBooleanOrDefault(object.get("offerMapFeedback"), true);
		this.autoTip = Utils.getAsBooleanOrDefault(object.get("autotip"), false);
		this.bloodVisibility = Utils.getAsBooleanOrDefault(object.get("bloodVisibility"), true);
		this.slashLobbyProtection = Utils.getAsBooleanOrDefault(object.get("lobbyProtection"), false);

		this.chatVisibility = Utils.getAsBooleanOrDefault(object.get("chatVisibility"), true);
		this.guildChatVisibility = Utils.getAsBooleanOrDefault(object.get("guildChatVisibility"), true);
		this.lobbyJoinMessage = Utils.getAsBooleanOrDefault(object.get("joinMessageSelf"), true);

		this.publicProfanityLevel = Utils.getAsEnumOrDefault(object.get("profanityLevel"),
				ProfanityLevel.STRONG_FILTER);
		this.partyProfanityLevel = Utils.getAsEnumOrDefault(object.get("profanityLevel_PARTY"),
				ProfanityLevel.STRONG_FILTER);
		this.guildProfanityLevel = Utils.getAsEnumOrDefault(object.get("profanityLevel_GUILD"),
				ProfanityLevel.STRONG_FILTER);
		this.privateMessageProfanityLevel = Utils.getAsEnumOrDefault(object.get("profanityLevel_PM"),
				ProfanityLevel.STRONG_FILTER);

		this.partyMessageSounds = Utils.getAsBooleanOrDefault(object.get("partyMessageSounds"), false);
		this.guildMessageSounds = Utils.getAsBooleanOrDefault(object.get("guildMessageSounds"), false);
		this.privateMessageSounds = Utils.getAsBooleanOrDefault(object.get("privateMessageSounds"), false);
		this.chatAlerts = Utils.getAsBooleanOrDefault(object.get("chatAlerts"), false);

		this.privateMessagePrivacy = Utils.getAsEnumOrDefault(object.get("privateMessagePrivacy"), PrivacyLevel.LOW);
		this.friendRequestPrivacy = Utils.getAsEnumOrDefault(object.get("friendRequestPrivacy"), PrivacyLevel.NONE);
		this.duelInvitePrivacy = Utils.getAsEnumOrDefault(object.get("duelInvitePrivacy"), PrivacyLevel.NONE);
		this.bridgeChallengePrivacy = Utils.getAsEnumOrDefault(object.get("bridgeChallengePrivacy"), PrivacyLevel.NONE);
		this.partyInvitePrivacy = Utils.getAsEnumOrDefault(object.get("partyInvitePrivacy"), PrivacyLevel.NONE);
		this.guildInvitePrivacy = Utils.getAsEnumOrDefault(object.get("guildInvitePrivacy"), PrivacyLevel.NONE);

		this.playerVisibility = Utils.getAsBooleanOrDefault(object.get("playerVisibility"), true);
		this.petVisibility = Utils.getAsBooleanOrDefault(object.get("petVisibility"), true);
		this.autoSpawnPet = Utils.getAsBooleanOrDefault(object.get("autoSpawnPet"), false);
		this.lobbyDarkMode = Utils.getAsBooleanOrDefault(object.get("lobbyDarkMode"), false);

		this.apiOnlineStatus = Utils.getAsBooleanOrDefault(object.get("apiSession"), true);
		this.apiRecentGames = Utils.getAsBooleanOrDefault(object.get("apiRecentGames"), true);

		this.spectatorSpeed = Utils.getAsIntOrDefault(object.get("spec_speed"), 0);
		this.spectatorAutoTeleport = Utils.getAsBooleanOrDefault(object.get("spec_auto_teleport"), false);
		this.spectatorFirstPerson = Utils.getAsBooleanOrDefault(object.get("spec_first_person"), false);
		this.spectatorNightVision = Utils.getAsBooleanOrDefault(object.get("spec_night_vision"), false);
		this.spectatorHideSpectators = Utils.getAsBooleanOrDefault(object.get("spec_spectators_invisible"), false);
	}

	public boolean hasAutoQueue() {
		return autoQueue;
	}

	public boolean hasUpdateNotifications() {
		return updateNotifications;
	}

	public QualityLevel getParticleQuality() {
		return particleQuality;
	}

	public boolean hasOfferMapFeedback() {
		return offerMapFeedback;
	}

	public boolean hasAutoTip() {
		return autoTip;
	}

	public boolean hasBloodVisibility() {
		return bloodVisibility;
	}

	public boolean hasSlashLobbyProtection() {
		return slashLobbyProtection;
	}

	public boolean hasChatVisibility() {
		return chatVisibility;
	}

	public boolean hasGuildChatVisibility() {
		return guildChatVisibility;
	}

	public boolean hasLobbyJoinMessage() {
		return lobbyJoinMessage;
	}

	public ProfanityLevel getPublicProfanityLevel() {
		return publicProfanityLevel;
	}

	public ProfanityLevel getPartyProfanityLevel() {
		return partyProfanityLevel;
	}

	public ProfanityLevel getGuildProfanityLevel() {
		return guildProfanityLevel;
	}

	public ProfanityLevel getPrivateMessageProfanityLevel() {
		return privateMessageProfanityLevel;
	}

	public boolean hasPartyMessageSounds() {
		return partyMessageSounds;
	}

	public boolean hasGuildMessageSounds() {
		return guildMessageSounds;
	}

	public boolean hasPrivateMessageSounds() {
		return privateMessageSounds;
	}

	public boolean hasChatAlerts() {
		return chatAlerts;
	}

	public PrivacyLevel getPrivateMessagePrivacy() {
		return privateMessagePrivacy;
	}

	public PrivacyLevel getFriendRequestPrivacy() {
		return friendRequestPrivacy;
	}

	public PrivacyLevel getDuelInvitePrivacy() {
		return duelInvitePrivacy;
	}

	/**
	 * @deprecated The bridge challenge privacy setting is no longer available
	 */
	@Deprecated
	public PrivacyLevel getBridgeChallengePrivacy() {
		return bridgeChallengePrivacy;
	}

	public PrivacyLevel getPartyInvitePrivacy() {
		return partyInvitePrivacy;
	}

	public PrivacyLevel getGuildInvitePrivacy() {
		return guildInvitePrivacy;
	}

	public boolean hasPlayerVisibility() {
		return playerVisibility;
	}

	public boolean hasPetVisibility() {
		return petVisibility;
	}

	public boolean hasAutoSpawnPet() {
		return autoSpawnPet;
	}

	public boolean hasLobbyDarkMode() {
		return lobbyDarkMode;
	}

	public boolean hasApiOnlineStatus() {
		return apiOnlineStatus;
	}

	public boolean hasApiRecentGames() {
		return apiRecentGames;
	}

	public int getSpectatorSpeed() {
		return spectatorSpeed;
	}

	public boolean hasSpectatorAutoTeleport() {
		return spectatorAutoTeleport;
	}

	public boolean hasSpectatorFirstPerson() {
		return spectatorFirstPerson;
	}

	public boolean hasSpectatorNightVision() {
		return spectatorNightVision;
	}

	public boolean hasSpectatorHideSpectators() {
		return spectatorHideSpectators;
	}

}
