package com.codersnitch.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codersnitch.ps.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
