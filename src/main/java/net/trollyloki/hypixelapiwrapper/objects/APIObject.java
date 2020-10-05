package net.trollyloki.hypixelapiwrapper.objects;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;

public abstract class APIObject {

	private final HypixelAPIWrapper api;

	public APIObject(HypixelAPIWrapper api) {
		this.api = api;
	}

	public HypixelAPIWrapper getAPI() {
		return api;
	}

}
