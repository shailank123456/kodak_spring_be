package com.kotak.cibilservices.taskschedulers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kotak.cibilservices.taskschedulers.domain.Product;
import com.kotak.cibilservices.taskschedulers.services.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping(value = "/product")
	public List<Product> getProduct() {
		List<Product> products = productService.findAll();
		return products;
	}
}
