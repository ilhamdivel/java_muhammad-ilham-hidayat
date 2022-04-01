package com.praktikum.service;

import com.praktikum.model.TransactionDetail;
import com.praktikum.repository.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionDetailService {

    @Autowired
    private TransactionDetailRepository repository;

    public List<TransactionDetail> findAll() {
        return repository.findAll();
    }

    public TransactionDetail findById(String id) {
        return repository.findById(id).orElseThrow(() -> {
            throw new Error("product dengan id " + id + " tidak ditemukan");
        });
    }

    public TransactionDetail create(TransactionDetail transactionDetail) {
        return repository.save(transactionDetail);
    }

    public TransactionDetail update(String id, TransactionDetail transactionDetail) {
        TransactionDetail transactionId = this.findById(id);
        transactionId.setProductId(transactionDetail.getProductId());
        transactionId.setQuantity(transactionDetail.getQuantity());

        return repository.save(transactionId);
    }

    public void delete(String id) {
        TransactionDetail transactionId =this.findById(id);
        repository.delete(transactionId);
    }
}
















