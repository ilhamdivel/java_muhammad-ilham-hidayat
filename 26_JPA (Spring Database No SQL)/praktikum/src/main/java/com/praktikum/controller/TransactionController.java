package com.praktikum.controller;


import com.praktikum.model.Transaction;
import com.praktikum.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Transaction transaction) {
        Transaction transactionCreated = transactionService.create(transaction);
        return ResponseEntity.ok(transactionCreated);
    }

    @GetMapping
    public ResponseEntity<?> listTransaction() {
        List<Transaction> transactions = transactionService.findAll();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> transactionById(@PathVariable String id){
        try {
            Transaction transaction = transactionService.findById(id);
            return ResponseEntity.ok(transaction);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Transaction transaction) {
        try {
            Transaction transactionUpdated = transactionService.update(id, transaction);
            return ResponseEntity.ok(transactionUpdated);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        try {
            transactionService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }

    }
}
