package com.thoughtworks.foody.dto;

import java.util.List;

import com.thoughtworks.foody.entity.Dish;

public class CartDetailsDto {
	
	private List<Dish> dishes;
	private int cartId;
	private double totalCost;
	private double delivery;
	
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
}
