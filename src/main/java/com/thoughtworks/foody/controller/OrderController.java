/**
 * 
 */
package com.thoughtworks.foody.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.foody.dto.CartDetailsDto;
import com.thoughtworks.foody.entity.Dish;
import com.thoughtworks.foody.service.CartService;

/**
 * @author mukilan
 *
 */
@RestController
@RequestMapping("/cart")
public class OrderController {
	
	@Autowired
	CartService cart;
	
	 @PostMapping("/addItems") 
	 public CartDetailsDto getOrderDetails(@RequestBody Map<Integer, Integer> dishes) {
		return cart.calculateCartDetails(dishes);
		 
	 }
	 
	/*
	 * @PostMapping("/checkout") public CartDetailsDto getOrderDetails(@RequestBody
	 * List<Dish> dishes) { return cart.calculateCartDetails(dishes);
	 * 
	 * }
	 */

}
