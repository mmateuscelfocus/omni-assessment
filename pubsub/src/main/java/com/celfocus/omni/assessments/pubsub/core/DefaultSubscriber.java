package com.celfocus.omni.assessments.pubsub.core;

import java.util.function.Consumer;

import com.celfocus.omni.assessments.pubsub.api.Subscriber;

public class DefaultSubscriber implements Subscriber {
	private Consumer<Object> consumer;

	public DefaultSubscriber(Consumer<Object> consumer) {
		this.consumer = consumer;
	}

	@Override
	public void execute(Object event) {
		consumer.accept(event);
	}

}
