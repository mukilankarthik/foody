/**
 * 
 */
package com.thoughtworks.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.foody.dto.RestarauntDetailsDto;
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
    public ResponseEntity<Restaurant> getRestaurantByName(@PathVariable("name") String restaurantName) {
    	return new ResponseEntity<>((restaurantService.getRestaurantByName(restaurantName)),HttpStatus.OK);
    }
    
    @GetMapping(value={"/rating/{Id}"})
    public ResponseEntity<RestarauntDetailsDto> getRestaurantRatingsByName(@PathVariable("Id") int restaurantId) {
    	return new ResponseEntity<>((restaurantService.getRestaurantRatings(restaurantId)),HttpStatus.OK);
    }
    
    @PutMapping(value={"/rating/add"})
    public ResponseEntity<String> addRatings(@RequestBody int restaurantId, @RequestBody int rating) {
    	return  ResponseEntity.ok(restaurantService.setRestaurantRating(restaurantId, rating));
    }
    

}
