package com.joel.springcloud.msproducts.services;

import java.util.List;
import java.util.Optional;

import com.joel.springcloud.msproducts.entities.Product;

public interface ProductService {
	
	List<Product> findAll();
	
	Optional<Product> findById(Long id);

}
