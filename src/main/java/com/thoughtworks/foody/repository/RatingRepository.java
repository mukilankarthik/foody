/**
 * 
 */
package com.thoughtworks.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtworks.foody.entity.Rating;
/**
 * @author mukilan
 *
 */
@Repository("ratingRepository")
public interface RatingRepository extends JpaRepository<Rating, Long>{
	
}
