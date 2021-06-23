package com.celfocus.omni.assessments.pubsub.api;

/**
 * 
 * The subscriber API
 *
 */
public interface Subscriber {

	/**
	 * Execute event
	 * @param event published event
	 */
	public void execute(Object event);

}
