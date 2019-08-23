/**
 * 
 */
package com.thoughtworks.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtworks.foody.entity.Dish;

/**
 * @author mukilan
 *
 */
@Repository("dishRepository")
public interface DishRepository extends JpaRepository<Dish, Long> {
	Dish getDishById(int id);
}
