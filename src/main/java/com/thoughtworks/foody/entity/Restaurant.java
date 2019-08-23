/**
 * 
 */
package com.thoughtworks.foody.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author mukilan
 *
 */
@Data
@Entity
@Table(name = "restaurant")
public class Restaurant { 
	
	public Restaurant(){
    	//Default Constructor
	}
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restaurant_id")
    private int id;
    
    @Column(name = "restaurant_name")
    private String name;
    
	@OneToMany(mappedBy="restaurantId", cascade = CascadeType.ALL)
    private Set<Dish> dishes;
	
	@OneToMany(mappedBy="restaurantId", cascade = CascadeType.ALL)
    private Set<Rating> ratings;
	
}
