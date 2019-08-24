/**
 * 
 */
package com.thoughtworks.foody.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.foody.dto.CartDetailsDto;
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
	 public ResponseEntity<CartDetailsDto> getOrderDetails(@RequestBody Map<Integer, Integer> dishes) {
		 return new ResponseEntity<>((cart.calculateCartDetails(dishes)), HttpStatus.OK);
	 }
	 
	
	/*
	 * @PostMapping("/checkout") public CartDetailsDto getOrderDetails(@RequestBody
	 * CartCheckoutDto cartCheckoutDto) { // return
	 * cart.calculateCartDetails(dishes); // return the payment api endpoint having
	 * all the payment methods
	 * 
	 * }
	 */
	 

}
