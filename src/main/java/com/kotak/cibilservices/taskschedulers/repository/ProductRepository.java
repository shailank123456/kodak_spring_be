package com.kotak.cibilservices.taskschedulers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kotak.cibilservices.taskschedulers.domain.Product;
import com.kotak.cibilservices.taskschedulers.domain.User;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	void saveAll(List<User> users);

	User findByUserName(String username);

}
