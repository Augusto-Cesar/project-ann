package com.ann.annsistem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ann.annsistem.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
