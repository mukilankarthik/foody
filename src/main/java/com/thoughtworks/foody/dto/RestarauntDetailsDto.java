/**
 * 
 */
package com.thoughtworks.foody.dto;

import java.util.List;
import java.util.Set;

import com.thoughtworks.foody.entity.Rating;

/**
 * @author mukilan
 *
 */
public class RestarauntDetailsDto {
	
	String restarauntName;
	int averageRating;
	Set<Rating> ratings;
	
	public Set<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(Set<Rating> rating) {
		this.ratings = rating;
	}

	public String getRestarauntName() {
		return restarauntName;
	}
	
	public void setRestarauntName(String restarauntName) {
		this.restarauntName = restarauntName;
	}

	public int getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	
	

}
