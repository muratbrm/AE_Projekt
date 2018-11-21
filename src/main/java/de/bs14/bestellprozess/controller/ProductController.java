/**
 * @author muratbrm
 * Diese Klasse hat die Aufgabe Http Methoden wie z.B PUT,GET,POST oder DELETE zu behandeln.
 */

package de.bs14.bestellprozess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(path="/create",method=RequestMethod.PUT)
	public Integer createProduct() {
		return productService.createProduct();
	}
	
	@RequestMapping(path="/show", method=RequestMethod.GET)
	public List<Product> showProducts(){
		return productService.showProducts();
	}
	
	@RequestMapping(path="/delete", method=RequestMethod.DELETE)
	public String deleteProduct() {
		return productService.deleteProduct();
	}
}
