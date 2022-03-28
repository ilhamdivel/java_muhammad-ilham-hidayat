package com.praktikum.controller;


import com.praktikum.model.Product;
import com.praktikum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.findAllProduct();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Optional<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/search/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        return productService.findByProductName(name);
    }

    @GetMapping("/category/{name}")
    public List<Product> getAllProductByCategory(@PathVariable String name) {
        return productService.findAllProductByCategory(name);
    }

    @GetMapping("/sort-by-category")
    public List<Product> sortAllProductByCategory() {
        return productService.sortProductByCategory();
    }

    @GetMapping("/{size}/{page}")
    public Iterable<Product> findAllWithPagging( @PathVariable int size, @PathVariable int page) {
        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllPagination(pageable);
    }
}
