package com.juan.spring.crud.app.crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.juan.spring.crud.app.crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
