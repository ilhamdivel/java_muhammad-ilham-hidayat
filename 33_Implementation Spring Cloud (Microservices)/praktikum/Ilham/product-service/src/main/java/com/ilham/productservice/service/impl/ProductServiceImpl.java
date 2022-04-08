package com.ilham.productservice.service.impl;

import com.ilham.productservice.model.Product;
import com.ilham.productservice.repository.ProductRepository;
import com.ilham.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByCategory(String category) {
        return productRepository.getAllByCategory(category);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> updateProduct(Long id, Product product) {
        Optional<Product> productById = this.findProductById(id);

        productById.ifPresent(res -> {
            res.setName(product.getName());
            res.setDescription(product.getDescription());
            res.setPrice(product.getPrice());

            productRepository.save(res);
        });
        return productById;
    }

    @Override
    public void deleteProduct(Long id) {
        Optional<Product> productById = this.findProductById(id);
        productById.ifPresent(productRepository::delete);
    }
}
