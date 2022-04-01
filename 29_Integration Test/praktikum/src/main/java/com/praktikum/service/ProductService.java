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
    ProductRepository productRepository;


    public Product findProductById(String id) {
        return productRepository.findById(id).orElseThrow(() -> {
            throw new Error("product dengan id" + id + "tidak ditemukan");
        });
    }

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Product updateProduct(String id, Product product) {
        Product productById = this.findProductById(id);
        productById.setName(product.getName());
        productById.setPrice(product.getPrice());

        return productRepository.save(productById);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public String removeProduct(String id) {
        Optional<Product> productById = productRepository.findById(id);

       productById.ifPresent(res -> {
           productRepository.delete(res);
       });
       return "Berhasil Delete";
    }
}
