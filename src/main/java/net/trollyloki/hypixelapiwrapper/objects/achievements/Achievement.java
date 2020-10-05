package net.trollyloki.hypixelapiwrapper.objects.achievements;

import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.enums.Game;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public abstract class Achievement extends APIObject {

	protected final Game game;
	protected final String id;

	private final String name, description;
	
	public Achievement(HypixelAPIWrapper api, Game game, String id, JsonObject object) {
		super(api);

		this.game = game;
		this.id = id;

		this.name = object.get("name").getAsString();
		this.description = object.get("description").getAsString();
	}

	public Game getGame() {
		return game;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
