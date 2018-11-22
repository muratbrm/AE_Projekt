/**
 * @author muratbrm
 * Diese Klasse hat die Aufgabe Http Methoden wie z.B PUT,GET,POST oder DELETE zu behandeln.
 */

package de.bs14.bestellprozess.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.bs14.bestellprozess.entity.Product;
import de.bs14.bestellprozess.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired(required=true)
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.POST)
	public Integer createProduct(@RequestHeader("id") Integer product_id, @RequestHeader("articleNumber") Long articleNumber
			,@RequestHeader("shortText") String shortText, @RequestHeader("longText") String longText, 
			@RequestHeader("headerText") String headerText, @RequestHeader("imagePath") String imagePath, @RequestHeader("price") Double price) {
		return productService.createProduct(new Product(product_id, articleNumber, price, imagePath, shortText, longText, headerText));
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Product> showProducts(){
		return productService.showProducts();
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public String deleteProduct(@RequestHeader("id")Integer id) {
		return productService.deleteProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateProduct(@RequestHeader("id") Integer product_id, @RequestHeader("articleNumber") Long articleNumber
			,@RequestHeader("shortText") String shortText, @RequestHeader("longText") String longText, 
			@RequestHeader("headerText") String headerText, @RequestHeader("imagePath") String imagePath, @RequestHeader("price") Double price) {

		productService.updateProduct(new Product(product_id, articleNumber, price, imagePath, shortText, longText, headerText));
	}
//	@RequestMapping(path="/update", value= {"id"}, method=RequestMethod.PUT)
//	public Integer updateProduct(@RequestBody Integer id) {
//		return productService.updateProduct(id);
//	}
}
