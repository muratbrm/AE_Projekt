/**
 * @author muratbrm
 * In den Service Klassen kommt die Businesslogik rein
 */

package de.bs14.bestellprozess.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bs14.bestellprozess.entity.Product;
import de.bs14.bestellprozess.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	
	
	public Integer createProduct(Product product) {
		productRepository.save(product);
		return product != null ? 200 : 404;
	}
	
	public List<Product> showProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
	public String deleteProduct(Integer id) {
		productRepository.deleteById(id);
		return "Produkt wurde gelöscht";
	}

	public void updateProduct(Product product) {
		Optional<Product> p =productRepository.findById(product.getProduct_id());
		productRepository.delete(p.get());
		productRepository.save(product);
		
	}
	
	
}
