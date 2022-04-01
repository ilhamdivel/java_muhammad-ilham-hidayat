package com.praktikum.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class TransactionDetail {
    @Id
    private String id;
    private String productId;
    private Integer quantity;
}
