package com.praktikum.domain.product;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment

    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
