package com.praktikum.service;


import com.praktikum.model.Transaction;
import com.praktikum.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction create(Transaction transaction) {
        transaction.setCreatedAt(LocalDateTime.now());
        return transactionRepository.save(transaction);

    }


    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }


    public Transaction findById(String id) {
        return transactionRepository.findById(id).orElseThrow(() -> {
            throw new Error("product dengan id "+ id +" tidak ditemukan");
        });
    }


    public Transaction update(String id, Transaction transaction) {
        Transaction transactionById = this.findById(id);
        transactionById.setCustomerName(transaction.getCustomerName());
        transactionById.setPaid(transaction.isPaid());
        transactionById.setTransactionDetail(transaction.getTransactionDetail());



        return transactionRepository.save(transactionById);
    }


    public void delete(String id) {
        Transaction transactionById =this.findById(id);
        transactionRepository.delete(transactionById);
    }
}
