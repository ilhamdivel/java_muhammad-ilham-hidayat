package com.praktikum.service;

import com.praktikum.model.Product;
import com.praktikum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }


    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public Product findById(String id) {
        return productRepository.findById(id).orElseThrow(() -> {
            throw new Error("product dengan id "+ id +" tidak ditemukan");
        });
    }


    public Product update(String id, Product product) {
        Product productById = this.findById(id);
        productById.setName(product.getName());
        productById.setPrice(product.getPrice());

        return productRepository.save(productById);
    }


    public void delete(String id) {
        Product productById =this.findById(id);
        productRepository.delete(productById);
    }
}
