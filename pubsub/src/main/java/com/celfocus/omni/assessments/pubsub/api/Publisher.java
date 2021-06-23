package com.celfocus.omni.assessments.pubsub.api;

import java.util.function.Consumer;

/**
 * 
 * The publisher API
 *
 */
public interface Publisher {

	/**
	 * Publishes an event.<br>
	 * This event is sent to all subscribers.
	 * 
	 * @param event Event to be published
	 */
	public void publish(Object object);

	/**
	 * Adds a new subscriber
	 * 
	 * @param <T> event type
	 * @param eventClass event class
	 * @param consumer handler of event
	 * @return
	 */
	public <T> Subscriber subscribe(Class<T> eventClass, Consumer<T> consumer);

	/**
	 * Removes a subscriber 
	 *
	 * @param <T> event type
	 * @param eventClass Event class
	 * @param subscriber Subscriber instance to be removed
	 */
	public <T> void unsubscribe(Class<T> eventClass, Subscriber subscriber);
}
