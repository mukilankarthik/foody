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
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private int cartId;
    
    @Column(name = "delivery_address")
    private String delivery;
    
	@OneToMany(mappedBy="restaurantId", cascade = CascadeType.ALL)
    private Set<Dish> dishes;

}
