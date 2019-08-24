/**
 * 
 */
package com.thoughtworks.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.foody.dto.PaymentDetailsDto;
import com.thoughtworks.foody.service.PaymentService;

/**
 * @author mukilan
 *
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
    @PostMapping(value={"/confirmPayment/"})
    public ResponseEntity<String> getRestaurantByName(@RequestBody PaymentDetailsDto paymentDetailsDto) {
    	return ResponseEntity.ok(paymentService.checkPaymnetSuccessfull(paymentDetailsDto));
    }
}
