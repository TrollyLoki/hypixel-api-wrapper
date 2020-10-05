package net.trollyloki.hypixelapiwrapper.wrappers;

import java.util.concurrent.CompletableFuture;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;

public abstract class ObjectWrapper<T> extends APIObject {

	private T object = null;

	public ObjectWrapper(HypixelAPIWrapper api) {
		super(api);
	}

	public CompletableFuture<T> get() {
		if (object == null) {
			CompletableFuture<T> future = fetch();
			future.thenAccept(object -> this.object = object);
			return future;
		}
		return CompletableFuture.completedFuture(object);
	}

	protected abstract CompletableFuture<T> fetch();

}
