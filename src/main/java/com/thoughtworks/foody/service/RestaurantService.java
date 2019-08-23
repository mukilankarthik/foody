/**
 * 
 */
package com.thoughtworks.foody.service;

import com.thoughtworks.foody.entity.Restaurant;

/**
 * @author mukilan
 *
 */
public interface RestaurantService {
	
	public Restaurant getRestaurantByName(String restaurantName);

	public Restaurant getRestaurantRatings(int restaurantId);
	
}
