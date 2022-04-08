package com.ilham.cartservice.repository;


import com.ilham.cartservice.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Product, Long> {
}
