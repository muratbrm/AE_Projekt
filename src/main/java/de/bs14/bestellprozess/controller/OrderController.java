/**
 * @author muratbrm
 * Diese Klasse hat die Aufgabe Http Methoden wie z.B PUT,GET,POST oder DELETE zu behandeln.
 */

package de.bs14.bestellprozess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.bs14.bestellprozess.entity.Orders;
import de.bs14.bestellprozess.service.OrderService;

@RestController
//@RequestMapping -> http://localhost:8080/orders
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired(required=true)
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Orders test() {
		return orderService.showOrder();
	}
}
