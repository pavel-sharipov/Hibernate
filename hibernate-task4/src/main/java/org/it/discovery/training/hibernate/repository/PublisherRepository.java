package org.it.discovery.training.hibernate.repository;

import org.it.discovery.training.hibernate.model.Publisher;

public interface PublisherRepository {
	
	/**
	 * Saves specified publisher instance
	 * @param publisher
	 */
	void save(Publisher publisher);
	
	/**
	 * Deletes publisher with specified identifier
	 * @param publisherId
	 */
	void delete(int publisherId);
	
	/**
	 * Returns publisher with specified identifier.
	 * If no publisher exists then NULL should be returned
	 * @param publisher
	 * @return
	 */
	Publisher findById(int publisher);

}
