/**
 * 
 */
package com.thoughtworks.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.foody.entity.Restaurant;
import com.thoughtworks.foody.service.RestaurantService;

/**
 * @author mukilan
 *
 */
@RestController
@RequestMapping("/restauraunt")
public class DishController {
	
	@Autowired
	RestaurantService restaurantService;
	
    @GetMapping(value={"/search/{name}"})
    public Restaurant getRestaurantByName(@PathVariable String restaurantName) {
		return restaurantService.getRestaurantByName(restaurantName);
    }
    
    @GetMapping(value={"/rating/{Id}"})
    public Restaurant getRestaurantRatingsByName(@PathVariable int restaurantId) {
		return restaurantService.getRestaurantRatings(restaurantId);
    }
    

}
