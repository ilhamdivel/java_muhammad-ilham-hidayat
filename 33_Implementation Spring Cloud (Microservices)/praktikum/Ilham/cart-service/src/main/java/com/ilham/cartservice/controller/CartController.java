package com.ilham.cartservice.controller;

import com.ilham.cartservice.dto.Product;
import com.ilham.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart-service")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/add-one-to-cart/{id}")
    public Product addOneToCart(@PathVariable Long id){
        return cartService.addOneToCart(id);
    }

    @GetMapping("/view-cart")
    public List<Product> viewCart() {
        return cartService.viewCart();
    }
}
