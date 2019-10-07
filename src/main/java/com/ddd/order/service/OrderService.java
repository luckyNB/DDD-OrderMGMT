/**

 * Copyright (c) 2018 Ketan Gote
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.

*/

package com.ddd.order.service;

import com.metamagic.ddd.dto.PaymentDTO;
import com.metamagic.ddd.dto.ShippingAddressDTO;
import com.metamagic.ddd.entity.Order;
import com.metamagic.ddd.exception.InvalidDataException;

/**
 * Domain Service which specifically focus on domain logic of order
 * @author ketan gote
 *
 */

public interface OrderService {

	/**
	 * creates the order
	 * @param order
	 */
	public void createOrder(Order order);
	
	/**
	 * adds shipping address to order
	 * @param dto
	 * @throws InvalidDataException
	 * @throws Exception
	 */
	public void addShippingAddressDetails(ShippingAddressDTO dto) throws InvalidDataException, Exception;
	
	/**
	 * adds payment details to order
	 * @param dto
	 * @throws InvalidDataException
	 * @throws Exception
	 */
	public void addPaymentDetails(PaymentDTO dto) throws InvalidDataException, Exception;
	
	/**
	 * Prints all order based on Specification given
	 * @throws Exception
	 */
	public void applyDiscount()  throws Exception;
}
