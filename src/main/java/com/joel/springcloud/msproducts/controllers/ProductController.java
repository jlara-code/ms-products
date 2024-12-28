package com.joel.springcloud.msproducts.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joel.springcloud.msproducts.entities.Product;
import com.joel.springcloud.msproducts.services.ProductService;

import jakarta.websocket.server.PathParam;

@RequestMapping("/products")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	private List<Product> getAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	private Optional<Product> getById(@PathParam("id") Long id) {
		 return service.findById(id);
	}
}
