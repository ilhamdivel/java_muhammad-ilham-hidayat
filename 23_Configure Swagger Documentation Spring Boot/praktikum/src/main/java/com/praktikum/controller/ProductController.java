package com.praktikum.controller;

import com.praktikum.entity.Product;
import com.praktikum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class ProductController {
    @Autowired

    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("products/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    @PostMapping("/products")
    public Product createNewProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/products/{id}")
    public Optional<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
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

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        Optional<Product> productbyId = productRepository.findById(id);

        productbyId.ifPresent(res -> {
            productRepository.delete(res);
        });
    }
}
