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
}
