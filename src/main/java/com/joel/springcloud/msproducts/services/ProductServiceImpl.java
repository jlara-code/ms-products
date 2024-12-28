package com.joel.springcloud.msproducts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joel.springcloud.msproducts.entities.Product;
import com.joel.springcloud.msproducts.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Product> findById(Long id) {
		return repository.findById(id);
	}

}
