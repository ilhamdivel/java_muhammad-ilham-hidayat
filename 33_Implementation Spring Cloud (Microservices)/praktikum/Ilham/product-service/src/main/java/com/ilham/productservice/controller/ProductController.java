package com.ilham.productservice.controller;

import com.ilham.productservice.model.Product;
import com.ilham.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product-service")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        return productService.findAllProduct();
    }

    @GetMapping("/products-by-category/{category}")
    public List<Product> getByCategory(@PathVariable String category){
        return productService.findByCategory(category);
    }

    @GetMapping("/product-by-id/{id}")
    public Optional<Product> getById(@PathVariable Long id){
        return productService.findProductById(id);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/product-by-id/{id}")
    public Optional<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
