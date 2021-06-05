package com.ecom.product.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductServiceController {

	@GetMapping
	public String testController() {
		return "hello productService";
	}
}
