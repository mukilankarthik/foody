/**
 * 
 */
package com.thoughtworks.foody.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.foody.dto.CartDetailsDto;
import com.thoughtworks.foody.entity.Dish;
import com.thoughtworks.foody.repository.DishRepository;
import com.thoughtworks.foody.service.CartService;

/**
 * @author mukilan
 *
 */
@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	DishRepository dishRepository;

	@Override
	public CartDetailsDto calculateCartDetails(Map<Integer, Integer> dishes) {
		List<Dish> dishesValue = null; 
		if (null != dishes) {
			for(Map.Entry<Integer, Integer> entry : dishes.entrySet()) {
				dishesValue = new ArrayList<>();
				dishesValue.add(dishRepository.getDishById(entry.getKey()));
			}
			double totalCost = 0.0;
			CartDetailsDto cartDetailsDto = new CartDetailsDto();
			cartDetailsDto.setDishes(dishesValue);
			totalCost = calculateTotalCartAmount(dishesValue);
			cartDetailsDto.setTotalCost(totalCost);
			cartDetailsDto.setDelivery(totalCost = totalCost > 200 ? totalCost : totalCost + 40);
			//cartDetailsDto.setCartId(cartId);
			return cartDetailsDto;
		}
		return null;
	}

	private double calculateTotalCartAmount(List<Dish> dishes) {
		double totalAmount = 0.0;
		if (null != dishes) {
			for(Dish dish : dishes) {
				totalAmount += dish.getCost() * dish.getCount();
			}
		}
		return totalAmount;
	}

}
