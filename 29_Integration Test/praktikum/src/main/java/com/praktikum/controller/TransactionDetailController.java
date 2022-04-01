package com.praktikum.controller;

import com.praktikum.model.TransactionDetail;
import com.praktikum.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/detail")
public class TransactionDetailController {

    @Autowired
    TransactionDetailService service;

    @GetMapping
    public ResponseEntity<?> listTransactionDetail() {
        List<TransactionDetail> transactionDetails = service.findAll();
        return ResponseEntity.ok(transactionDetails);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> transactionDetailByID(@PathVariable String id){
        try {
            TransactionDetail transactionDetail = service.findById(id);
            return ResponseEntity.ok(transactionDetail);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TransactionDetail transactionDetail) {
        TransactionDetail transactionCreated = service.create(transactionDetail);
        return ResponseEntity.ok(transactionCreated);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody TransactionDetail transactionDetail) {
        try {
            TransactionDetail transactionUpdated = service.update(id, transactionDetail);
            return ResponseEntity.ok(transactionUpdated);
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        try {
            service.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            InternalError internalError = new InternalError(e.getMessage());
            return ResponseEntity.internalServerError().body(internalError);
        }

    }
}
