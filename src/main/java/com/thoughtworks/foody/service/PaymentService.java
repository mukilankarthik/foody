/**
 * 
 */
package com.thoughtworks.foody.service;

import com.thoughtworks.foody.dto.PaymentDetailsDto;

/**
 * @author mukilan
 *
 */
public interface PaymentService {

	String checkPaymnetSuccessfull(PaymentDetailsDto paymentDetailsDto);

}
