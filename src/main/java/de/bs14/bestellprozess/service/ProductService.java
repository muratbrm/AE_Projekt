/**
 * @author muratbrm
 * In den Service Klassen kommt die Businesslogik rein
 */

package de.bs14.bestellprozess.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bs14.bestellprozess.entity.Product;
import de.bs14.bestellprozess.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	private Product product = new Product(new AtomicInteger().getAndIncrement(), Integer.toUnsignedLong(353535553), 30.90, "/home/bestellprozess_images/", "kurzer Text", "langer Text", "Überschrift");
	public Integer createProduct() {
		productRepository.save(product);
		return product != null ? 200 : 404;
	}
	
	public List<Product> showProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
	public String deleteProduct() {
		productRepository.delete(product);
		return "Produkt wurde gelöscht";
	}
	
	
}
