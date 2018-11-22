package de.bs14.bestellprozess.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
		@GetMapping("/helloworld")
	   public String index(Model model) {
	      model.addAttribute("message", "Hello Spring MVC 5!");
	      return "index";
	   }
}
