package com.kotak.cibilservices.taskschedulers.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kotak.cibilservices.taskschedulers.domain.Product;
import com.kotak.cibilservices.taskschedulers.domain.User;
import com.kotak.cibilservices.taskschedulers.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
	@Override
	public List<Product> findAll() {
//creating an object of ArrayList
		ArrayList<Product> products = new ArrayList<Product>();
//adding products to the List
		products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));
		products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));
		products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));
		products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));
		products.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));
//returns a list of product
		return products;
	}
	
	@Autowired
	private ProductRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user = repository.findByUserName(username);
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
		
	}
}
