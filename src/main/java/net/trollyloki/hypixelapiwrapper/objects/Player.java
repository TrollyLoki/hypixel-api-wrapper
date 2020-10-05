package net.trollyloki.hypixelapiwrapper.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.stream.Collectors;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.enums.Game;
import net.trollyloki.hypixelapiwrapper.objects.stats.GameStats;
import net.trollyloki.hypixelapiwrapper.objects.stats.PitGameStats;
import net.trollyloki.hypixelapiwrapper.wrappers.OneTimeAchievementWrapper;
import net.trollyloki.hypixelapiwrapper.wrappers.TieredAchievementWrapper;

public class Player extends APIObject {

	private final String id;
	private final UUID uuid;

	private final String playername, displayname;
	private final String[] knownAliases, knownAliasesLower;

	private final Date firstLogin, lastLogin;

	private final List<OneTimeAchievementWrapper> oneTimeAchievements;
	private final List<TieredAchievementWrapper> tieredAchievements;

	private final PlayerSettings settings;

	@Deprecated
	private final int timePlaying;
	private final int vanityTokens;

	private final Map<Game, GameStats> stats;

	public Player(HypixelAPIWrapper api, JsonObject object) {
		super(api);

		this.id = object.get("_id").getAsString();
		this.uuid = UUID.fromString(Utils.addDashesToUuid(object.get("uuid").getAsString()));

		this.playername = object.get("playername").getAsString();
		this.displayname = object.get("displayname").getAsString();
		this.knownAliases = Utils.convertJsonArrayToStringArray(object.getAsJsonArray("knownAliases"));
		this.knownAliasesLower = Utils.convertJsonArrayToStringArray(object.getAsJsonArray("knownAliasesLower"));

		this.firstLogin = Utils.getAsDateOrDefault(object.get("firstLogin"), null);
		this.lastLogin = Utils.getAsDateOrDefault(object.get("lastLogin"), null);

		this.oneTimeAchievements = new ArrayList<>();
		for (JsonElement element : object.getAsJsonArray("achievementsOneTime")) {
			try {
				oneTimeAchievements.add(new OneTimeAchievementWrapper(api, element.getAsString()));
			} catch (IllegalArgumentException e) {
			}
		}

		this.tieredAchievements = new ArrayList<>();
		for (Entry<String, JsonElement> entry : object.getAsJsonObject("achievements").entrySet()) {
			try {
				tieredAchievements.add(new TieredAchievementWrapper(api, entry.getKey(), entry.getValue().getAsInt()));
			} catch (IllegalArgumentException e) {
			}
		}

		this.settings = new PlayerSettings(api, object.getAsJsonObject("settings"));

		this.timePlaying = Utils.getAsIntOrDefault(object.get("timePlaying"), 0);
		this.vanityTokens = Utils.getAsIntOrDefault(object.get("vanityTokens"), 0);

		this.stats = new HashMap<>();
		for (Entry<String, JsonElement> entry : object.getAsJsonObject("stats").entrySet()) {
			Game game = Game.getById(entry.getKey().toLowerCase());
			switch (game) {

			case PIT:
				stats.put(game, new PitGameStats(api, entry.getValue().getAsJsonObject()));
				break;
			default:
				break;

			}
		}
	}

	public String getId() {
		return id;
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getPlayername() {
		return playername;
	}

	public String getDisplayname() {
		return displayname;
	}

	public String[] getKnownAliases() {
		return Arrays.copyOf(knownAliases, knownAliases.length);
	}

	public String[] getKnownAliasesLower() {
		return Arrays.copyOf(knownAliasesLower, knownAliasesLower.length);
	}

	public Date getFirstLogin() {
		return (Date) firstLogin.clone();
	}

	public Date getLastLogin() {
		if (lastLogin == null)
			return null;
		return (Date) lastLogin.clone();
	}

	public List<OneTimeAchievementWrapper> getOneTimeAchievements() {
		return new ArrayList<>(oneTimeAchievements);
	}

	public List<OneTimeAchievementWrapper> getOneTimeAchievements(Game game) {
		return oneTimeAchievements.stream().filter(a -> a.getGame() == game).collect(Collectors.toList());
	}

	public List<TieredAchievementWrapper> getTieredAchievements() {
		return new ArrayList<>(tieredAchievements);
	}

	public List<TieredAchievementWrapper> getTieredAchievements(Game game) {
		return tieredAchievements.stream().filter(a -> a.getGame() == game).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "Player{uuid=" + uuid + ", playername=" + playername + "}";
	}

	public PlayerSettings getSettings() {
		return settings;
	}

	/**
	 * @deprecated Total play time is no longer tracked
	 */
	@Deprecated
	public int getTimePlaying() {
		return timePlaying;
	}

	public int getVanityTokens() {
		return vanityTokens;
	}

	public List<GameStats> getStats() {
		return new ArrayList<>(stats.values());
	}

	public GameStats getStats(Game game) {
		return stats.get(game);
	}

}
