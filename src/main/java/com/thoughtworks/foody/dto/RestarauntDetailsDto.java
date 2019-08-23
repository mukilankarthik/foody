/**
 * 
 */
package com.thoughtworks.foody.dto;

import java.util.List;

import com.thoughtworks.foody.entity.Rating;

/**
 * @author mukilan
 *
 */
public class RestarauntDetailsDto {
	
	String restarauntName;
	List<Rating> ratings;
	
	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public String getRestarauntName() {
		return restarauntName;
	}
	
	public void setRestarauntName(String restarauntName) {
		this.restarauntName = restarauntName;
	}
	
	

}
