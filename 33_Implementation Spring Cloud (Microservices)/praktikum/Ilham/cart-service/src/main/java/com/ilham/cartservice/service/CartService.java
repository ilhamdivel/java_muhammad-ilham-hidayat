package com.ilham.cartservice.service;

import com.ilham.cartservice.dto.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CartService {
    List<Product> viewCart();
    Product addOneToCart(Long id);
}
