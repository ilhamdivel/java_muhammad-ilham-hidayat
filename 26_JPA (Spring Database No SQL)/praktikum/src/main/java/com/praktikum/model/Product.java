package com.praktikum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    public String id;
    public String name;
    public float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
}
