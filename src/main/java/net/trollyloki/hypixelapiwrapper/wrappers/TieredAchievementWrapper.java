package net.trollyloki.hypixelapiwrapper.wrappers;

import java.util.concurrent.CompletableFuture;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;
import net.trollyloki.hypixelapiwrapper.objects.achievements.Tier;
import net.trollyloki.hypixelapiwrapper.objects.achievements.TieredAchievement;

public class TieredAchievementWrapper extends AchievementWrapper<TieredAchievement> {

	private final int amount;

	public TieredAchievementWrapper(HypixelAPIWrapper api, Game game, String id, int amount) {
		super(api, game, id);
		this.amount = amount;
	}

	public TieredAchievementWrapper(HypixelAPIWrapper api, String achievement, int amount) {
		super(api, achievement);
		this.amount = amount;
	}

	public CompletableFuture<Tier> getTier() {
		return get().thenApply((achievement) -> {
			Tier lastTier = null;
			for (Tier tier : achievement.getTiers())
				if (tier.getAmount() > amount)
					return lastTier;
				else
					lastTier = tier;
			return lastTier;
		});
	}

	@Override
	public CompletableFuture<TieredAchievement> fetch() {
		return getAPI().getTieredAchievement(game, id);
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "TieredAchievementWrapper{game=" + game + ", id=" + id + ", amount=" + amount + "}";
	}

}
