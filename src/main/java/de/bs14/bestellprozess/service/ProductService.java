/**
 * @author muratbrm
 * In den Service Klassen kommt die Businesslogik rein
 */

package de.bs14.bestellprozess.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import de.bs14.bestellprozess.entity.Product;

@Service
public class ProductService {
	
	
	private List<Product> product = new ArrayList<>();
	
	public Integer createProduct() {
		this.product.add(new Product(new AtomicInteger().getAndIncrement(), Integer.toUnsignedLong(353535553), 30.90, "/home/bestellprozess_images/", "kurzer Text", "langer Text", "Überschrift"));
		return product != null ? 200 : 404;
	}
	
	public List<Product> showProducts() {
		return this.product;
	}
}
