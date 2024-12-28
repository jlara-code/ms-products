package com.joel.springcloud.msproducts.repositories;

import org.springframework.data.repository.CrudRepository;

import com.joel.springcloud.msproducts.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
