package com.praktikum.repository;

import com.praktikum.model.TransactionDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionDetailRepository extends MongoRepository<TransactionDetail, String> {
}
