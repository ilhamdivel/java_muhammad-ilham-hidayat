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

    public Transaction findById(String id) {
        return transactionRepository.findById(id).orElseThrow(() -> {
            throw new Error("transaction dengan id "+ id+ "tidak ditemukan" );
        });
    }

    public List<Transaction> findAllTransaction() {
        return transactionRepository.findAll();
    }

    public Transaction create(Transaction transaction) {
        transaction.setCreatedAt(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(String id, Transaction transaction) {
        Transaction transactionId = this.findById(id);
        transactionId.setCustomerName(transaction.getCustomerName());
        transactionId.setPaid(transaction.getPaid());
        transactionId.setTransactionDetail(transaction.getTransactionDetail());

        return transactionRepository.save(transactionId);
    }

    public String delete(String id) {
        Transaction transactionId  = this.findById(id);
        transactionRepository.delete(transactionId);
        return "Berhasil Delete Transaction";
    }

}
