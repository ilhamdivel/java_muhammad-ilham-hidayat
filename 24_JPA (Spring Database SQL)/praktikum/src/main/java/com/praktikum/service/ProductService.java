package com.praktikum.service;

import com.praktikum.model.Product;
import com.praktikum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
            res.setName(product.getName());
            res.setDescription(product.getDescription());
            res.setPrice(product.getPrice());
            res.setStock(product.getStock());

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






}
