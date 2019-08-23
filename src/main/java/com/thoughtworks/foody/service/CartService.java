/**
 * 
 */
package com.thoughtworks.foody.service;

import java.util.Map;

import com.thoughtworks.foody.dto.CartDetailsDto;

/**
 * @author mukilan
 *
 */
public interface CartService {
	
	CartDetailsDto calculateCartDetails(Map<Integer, Integer> dishes);
	
}
