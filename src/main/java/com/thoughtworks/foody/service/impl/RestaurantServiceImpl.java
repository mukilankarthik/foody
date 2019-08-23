/**
 * 
 */
package com.thoughtworks.foody.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Restaurant getRestaurantRatings(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

}
