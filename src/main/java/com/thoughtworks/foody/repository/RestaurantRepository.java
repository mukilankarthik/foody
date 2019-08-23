/**
 * 
 */
package com.thoughtworks.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtworks.foody.entity.Restaurant;

/**
 * @author mukilan
 *
 */
@Repository("restaurantRepository")
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
	
	Restaurant getRestaurantByName(String name);
	
	Restaurant getRestaurantById(int id);

}
