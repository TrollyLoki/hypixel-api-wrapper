package net.trollyloki.hypixelapiwrapper.objects.stats;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public abstract class GameStats extends APIObject {

	protected final Game game;

	public GameStats(HypixelAPIWrapper api, Game game) {
		super(api);
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

}
