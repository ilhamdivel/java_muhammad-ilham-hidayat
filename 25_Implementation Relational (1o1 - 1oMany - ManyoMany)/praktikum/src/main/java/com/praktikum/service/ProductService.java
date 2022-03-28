package com.praktikum.service;

import com.praktikum.model.Product;
import com.praktikum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> updateProduct(Long id, Product product) {
        Optional<Product> productById = productRepository.findById(id);

        productById.ifPresent(res -> {
            res.setProductName(product.getProductName());
            res.setModelYear(product.getModelYear());
            res.setPrice(product.getPrice());

            productRepository.save(res);
        });

        return productById;
    }

    public void deleteProduct(Long id){
        Optional<Product> productbyId = productRepository.findById(id);
        productbyId.ifPresent(res -> {
            productRepository.delete(res);
        });
    }

    public List<Product> findByProductName(String name) {
        return productRepository.findByProductNameIsContaining(name);
    }

    public List<Product> findAllProductByCategory(String name) {
        return productRepository.findByCategory_CategoryNameIsContaining(name);
    }

    public List<Product> sortProductByCategory() {
        return productRepository.findAllByOrderByCategory_CategoryId();
    }

    public Iterable<Product> getAllPagination(Pageable pageable) {
        return productRepository.findAll(pageable);

    }






}
