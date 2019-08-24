/**
 * 
 */
package com.thoughtworks.foody.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtworks.foody.entity.Cart;

/**
 * @author mukilan
 *
 */
@Repository("cartRepository")
public interface CartRepository extends JpaRepository<Cart, Long>{

	Cart getCartDetailsByCartId(int id);
	
}
