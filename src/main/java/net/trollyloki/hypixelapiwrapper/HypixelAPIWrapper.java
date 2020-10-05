package net.trollyloki.hypixelapiwrapper;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import net.hypixel.api.HypixelAPI;
import net.hypixel.api.util.ResourceType;
import net.trollyloki.hypixelapiwrapper.enums.Game;
import net.trollyloki.hypixelapiwrapper.objects.Player;
import net.trollyloki.hypixelapiwrapper.objects.achievements.OneTimeAchievement;
import net.trollyloki.hypixelapiwrapper.objects.achievements.TieredAchievement;

public class HypixelAPIWrapper {

	private final HypixelAPI api;

	public HypixelAPIWrapper(UUID apiKey) {
		this.api = new HypixelAPI(apiKey);
	}

	public CompletableFuture<Player> getPlayer(UUID uuid) {
		return api.getPlayerByUuid(uuid).thenApply((reply) -> {
			if (reply.getPlayer() == null)
				return null;
			return new Player(this, reply.getPlayer());
		});
	}

	public CompletableFuture<OneTimeAchievement> getOneTimeAchievement(Game game, String id) {
		return api.getResource(ResourceType.ACHIEVEMENTS).thenApply(
				reply -> new OneTimeAchievement(this, game, id, reply.getResponse().getAsJsonObject("achievements")
						.getAsJsonObject(game.getId()).getAsJsonObject("one_time").getAsJsonObject(id.toUpperCase())));
	}

	public CompletableFuture<TieredAchievement> getTieredAchievement(Game game, String id) {
		return api.getResource(ResourceType.ACHIEVEMENTS).thenApply(
				reply -> new TieredAchievement(this, game, id, reply.getResponse().getAsJsonObject("achievements")
						.getAsJsonObject(game.getId()).getAsJsonObject("tiered").getAsJsonObject(id.toUpperCase())));
	}

	@Override
	public String toString() {
		return "HypixelAPIWrapper{apiKey=" + api.getApiKey() + "}";
	}

}
