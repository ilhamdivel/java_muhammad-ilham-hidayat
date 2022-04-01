package com.praktikum.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
public class Transaction {
    @Id
    private String id;
    private String customerName;
    private String transactionDetail;
    private String paid;
    private LocalDateTime createdAt;



}
