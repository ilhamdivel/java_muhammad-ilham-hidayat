package com.praktikum.repository;

import com.praktikum.model.Category;
import com.praktikum.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.websocket.PongMessage;
import javax.websocket.server.PathParam;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAll(Pageable pageable);
    public List<Product> findByProductNameIsContaining(String name);
    public List<Product> findByCategory_CategoryNameIsContaining(String name);
    public List<Product> findAllByOrderByCategory_CategoryId();

}
