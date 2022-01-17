package com.kotak.cibilservices.taskschedulers.services;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kotak.cibilservices.taskschedulers.domain.Product;
public interface IProductService 
{
List<Product> findAll();

UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
