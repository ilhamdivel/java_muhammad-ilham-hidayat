package com.praktikum.service;


import com.praktikum.model.TransactionDetail;
import com.praktikum.repository.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionDetailService {
    @Autowired
    TransactionDetailRepository transactionDetailRepository;

    public TransactionDetail create(TransactionDetail transactionDetail) {
        return transactionDetailRepository.save(transactionDetail);
    }


    public List<TransactionDetail> findAll() {
        return transactionDetailRepository.findAll();
    }


    public TransactionDetail findById(String id) {
        return transactionDetailRepository.findById(id).orElseThrow(() -> {
            throw new Error("product dengan id "+ id +" tidak ditemukan");
        });
    }


    public TransactionDetail update(String id, TransactionDetail transactionDetail) {
        TransactionDetail transactionById = this.findById(id);
        transactionById.setProductId(transactionDetail.getProductId());
        transactionById.setQuantity(transactionById.getQuantity());

        return transactionDetailRepository.save(transactionById);
    }


    public void delete(String id) {
        TransactionDetail transactionById =this.findById(id);
        transactionDetailRepository.delete(transactionById);
    }

}
