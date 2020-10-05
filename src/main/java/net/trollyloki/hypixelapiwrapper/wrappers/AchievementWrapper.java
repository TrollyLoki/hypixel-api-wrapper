package net.trollyloki.hypixelapiwrapper.wrappers;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;

public abstract class AchievementWrapper<T> extends ObjectWrapper<T> {

	protected final Game game;
	protected final String id;

	public AchievementWrapper(HypixelAPIWrapper api, Game game, String id) {
		super(api);
		this.game = game;
		this.id = id;
	}

	public AchievementWrapper(HypixelAPIWrapper api, String achievement) {
		super(api);
		int index = achievement.indexOf('_');
		this.game = Game.getById(achievement.substring(0, index));
		this.id = achievement.substring(index + 1, achievement.length());
	}

	public Game getGame() {
		return game;
	}

	public String getId() {
		return id;
	}

}
