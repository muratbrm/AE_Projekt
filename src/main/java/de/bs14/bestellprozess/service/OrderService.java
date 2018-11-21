/**
 * @author muratbrm
 * In den Service Klassen kommt die Businesslogik rein
 */

package de.bs14.bestellprozess.service;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import de.bs14.bestellprozess.entity.Orders;

@Service
public class OrderService {
	
	private Orders orders = new Orders();
	
	
	public Orders showOrder() {
		orders.setDeliverDate(new Date());
		orders.setOrder_id(new AtomicInteger().incrementAndGet());
		return orders;
	}
}
