/**
 * 
 */
package com.thoughtworks.foody.service;

import com.thoughtworks.foody.dto.RestarauntDetailsDto;
import com.thoughtworks.foody.entity.Restaurant;

/**
 * @author mukilan
 *
 */
public interface RestaurantService {
	
	public Restaurant getRestaurantByName(String restaurantName);

	public RestarauntDetailsDto getRestaurantRatings(int restaurantId);

	public String setRestaurantRating(int restaurantId, int rating);
	
}
