package com.codersnitch.ps.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.codersnitch.ps.dto.ProductRequest;
import com.codersnitch.ps.dto.ProductResponse;
import com.codersnitch.ps.model.Product;
import com.codersnitch.ps.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	private final ProductRepository productRepository;
	
	/*
	-->@RequiredArgsConstructor
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	*/
	
	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		
		productRepository.save(product);
		log.info("Product {} is saved",product.getId());
	}

	public List<ProductResponse> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products.stream().map(this::mapToProductResponse).toList();
	}
	
	private ProductResponse mapToProductResponse(Product product) {
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.build();
	}

}
