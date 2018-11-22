package de.bs14.bestellprozess.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import de.bs14.bestellprozess.entity.Product;
import de.bs14.bestellprozess.repository.ProductRepository;
import de.bs14.bestellprozess.service.ProductService;

@RestController
public class MainController {
		
	   @Resource
	   private ProductRepository productRepository;
       
	   @Autowired
	   private ProductService productService;
	   
	   @GetMapping("/indextest")
	   public String index(Model model) {
	      model.addAttribute("message", "Hello Spring MVC 5!");
	      return "index";
	   }
		@RequestMapping(value= "/indexdubauer")
		 public ModelAndView getProducts (Model model){
		        Map<String,Object> params = new HashMap<>();
		        Collection<Product> products = productService.showProducts();
		        params.put("p",products);
		        params.forEach((k,v)-> model.addAttribute("p", v));
		        
		        return new ModelAndView("index",params);
		    }
}
