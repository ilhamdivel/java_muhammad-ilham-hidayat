package com.ilham.productservice.service;

import com.ilham.productservice.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> findProductById(Long id);
    List<Product> findAllProduct();

    List<Product> findByCategory(String category);

    Product createProduct(Product product);

    Optional<Product> updateProduct(Long id, Product product);

    void deleteProduct(Long id);



}
