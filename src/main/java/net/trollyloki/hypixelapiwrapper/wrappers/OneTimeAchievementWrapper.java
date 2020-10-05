package net.trollyloki.hypixelapiwrapper.wrappers;

import java.util.concurrent.CompletableFuture;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;
import net.trollyloki.hypixelapiwrapper.objects.achievements.OneTimeAchievement;

public class OneTimeAchievementWrapper extends AchievementWrapper<OneTimeAchievement> {

	public OneTimeAchievementWrapper(HypixelAPIWrapper api, Game game, String id) {
		super(api, game, id);
	}

	public OneTimeAchievementWrapper(HypixelAPIWrapper api, String achievement) {
		super(api, achievement);
	}

	@Override
	public CompletableFuture<OneTimeAchievement> fetch() {
		return getAPI().getOneTimeAchievement(game, id);
	}

	@Override
	public String toString() {
		return "OneTimeAchievementWrapper{game=" + game + ", id=" + id + "}";
	}

}
