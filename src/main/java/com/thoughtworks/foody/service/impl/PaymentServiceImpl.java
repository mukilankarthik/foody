/**
 * 
 */
package com.thoughtworks.foody.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.foody.dto.PaymentDetailsDto;
import com.thoughtworks.foody.repository.CartRepository;
import com.thoughtworks.foody.service.PaymentService;

/**
 * @author mukilan
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	CartRepository cartRepository;
	
	@Override
	public String checkPaymnetSuccessfull(PaymentDetailsDto paymentDetailsDto) {
		if (null != cartRepository.getCartDetailsByCartId(paymentDetailsDto.getCartId()))
			switch(paymentDetailsDto.getPaymentType()) {
				case "Cash" : 
					return "Please collect cash from user";
				case "Card" :
					return "Card Payment successfull";
				case "UPI" : 
					return "UPI Payment successfull";
				default :
					return "Payment Error";
			}
		return "Payment Error";
	}

}
