package com.ilham.cartservice.service.impl;


import com.ilham.cartservice.dto.Product;
import com.ilham.cartservice.repository.CartRepository;
import com.ilham.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private RestTemplate restTemplate;

    private String BASE_URI = "http://localhost:8081/product-service";
    private List<Product> productList = new ArrayList<>();




    @Override
    public Product addOneToCart(Long id) {
        String url = BASE_URI + "/product-by-id/" + id;
        Product product = restTemplate.getForObject(url, Product.class);
        productList.add(product);
        return cartRepository.save(product) ;
    }

    @Override
    public List<Product> viewCart() {
        return cartRepository.findAll();
    }
}
