package com.praktikum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("transactionDetail")
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDetail {
    @Id
    private String id;

    private String productId;

    private Integer quantity;


}
