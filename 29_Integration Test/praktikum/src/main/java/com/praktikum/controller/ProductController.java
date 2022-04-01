package com.praktikum.controller;

import com.praktikum.model.Product;
import com.praktikum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.findProductById(id);
    }

    @GetMapping
    public ResponseEntity<?> getAllProduct() {
        List<Product> products = productService.findAllProduct();
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public Product createNewProduct( @RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public String DeleteProduct(@PathVariable String id) {
        return productService.removeProduct(id);
    }

}
