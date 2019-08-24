/**
 * 
 */
package com.thoughtworks.foody.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author mukilan
 *
 */
@Data
@Entity
@Table(name = "rating")
public class Rating {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rating_id")
    private int ratingId;
    
    @Column(name = "rating")
    private int restaurantRating;
    
    @Column(name = "comments")
    private String comments;
    
    @Column(name = "restaurant_id")
    private int restaurantId;
    
    @Column(name = "user_id")
    private int userId;

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public int getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(int restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
    
    
}
