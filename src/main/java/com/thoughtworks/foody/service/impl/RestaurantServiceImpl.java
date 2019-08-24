/**
 * 
 */
package com.thoughtworks.foody.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.foody.dto.RestarauntDetailsDto;
import com.thoughtworks.foody.entity.Rating;
import com.thoughtworks.foody.entity.Restaurant;
import com.thoughtworks.foody.repository.RestaurantRepository;
import com.thoughtworks.foody.service.RestaurantService;

/**
 * @author mukilan
 *
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public Restaurant getRestaurantByName(String restaurantName) {
		return restaurantRepository.getRestaurantByName(restaurantName);
	}

	@Override
	public RestarauntDetailsDto getRestaurantRatings(int restaurantId) {
		Restaurant restaurant = restaurantRepository.getRestaurantById(restaurantId);
		if (null != restaurant) {
			RestarauntDetailsDto restarauntDetailsDto = new RestarauntDetailsDto();
			restarauntDetailsDto.setAverageRating(calculateRestaurantRatings(restaurant.getRatings()));
			restarauntDetailsDto.setRatings(restaurant.getRatings());
			restarauntDetailsDto.setRestarauntName(restaurant.getName());
			return restarauntDetailsDto;
		}
		return null;
	}

	private int calculateRestaurantRatings(Set<Rating> ratings) {
		int avgRating = 0;
		if(null != ratings) {
			for(Rating rating : ratings) {
				avgRating += rating.getRestaurantRating();
			}
			avgRating = avgRating != 0 ? avgRating/5 : 0; 
		}
		return avgRating;
	}

	@Override
	public String setRestaurantRating(int restaurantId, int rating) {
		Restaurant restaurant = restaurantRepository.getRestaurantById(restaurantId);
		Rating restaurantRating = new Rating();
		restaurantRating.setRestaurantRating(rating);
		restaurantRating.setRestaurantId(restaurant.getId());
		Set<Rating> ratings  = new HashSet<Rating>();
		ratings.add(restaurantRating);
        restaurant.setRatings(ratings);
        restaurantRepository.save(restaurant);
		return "Rating Successfully saved.";
	}

}
