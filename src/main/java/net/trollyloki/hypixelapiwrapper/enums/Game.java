package net.trollyloki.hypixelapiwrapper.enums;

import java.util.Arrays;
import java.util.List;

public enum Game {
	ARCADE("arcade"), ARENA_BRAWL("arena"), BED_WARS("bedwars"), BLITZ_SURVIVAL_GAMES("blitz", "hungergames"),
	BUILD_BATTLE("buildbattle"), CHRISTMAS_2017("christmas2017"), COPS_AND_CRIMS("copsandcrims", "mcgo"),
	DUELS("duels"), EASTER("easter"), GENERAL("general"), GINGERBREAD("gingerbread"), HALLOWEEN_2017("halloween2017"),
	HOUSING("housing"), LEGACY("legacy"), MURDER_MYSTERY("murdermystery"), PAINTBALL("paintball"), PIT("pit"), QUAKECRAFT("quake"),
	SKYBLOCK("skyblock"), SKYCLASH("skyclash"), SKYWARS("skywars"), SPEED_UHC("speeduhc"), SUMMER("summer"),
	SMASH_HEROES("supersmash"), TNT_GAMES("tntgames"), CRAZY_WALLS("truecombat"), UHC("uhc"), VAMPIREZ("vampirez"),
	WALLS("walls"), MEGA_WALLS("walls3"), WARLORDS("warlords", "battleground");

	private String id;
	private List<String> altIds;

	private Game(String id, String... altIds) {
		this.id = id;
		this.altIds = Arrays.asList(altIds);
	}

	public String getId() {
		return id;
	}

	public static Game getById(String id) {
		for (Game game : values())
			if (game.id.equals(id) || game.altIds.contains(id))
				return game;
		throw new IllegalArgumentException("No game with id " + id);
	}

}
