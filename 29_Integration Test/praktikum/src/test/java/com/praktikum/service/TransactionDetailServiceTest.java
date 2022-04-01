package com.praktikum.service;

import com.praktikum.model.Product;
import com.praktikum.model.TransactionDetail;
import com.praktikum.repository.TransactionDetailRepository;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class TransactionDetailServiceTest {
    private final EasyRandom EASY_RANDOM = new EasyRandom();
    private String id;

    @Mock
    private TransactionDetailRepository repository;

    @InjectMocks
    private TransactionDetailService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        id = EASY_RANDOM.nextObject(String.class);
    }

    @Test
    public void testCreate() {
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setId("1");
        transactionDetail.setProductId("2");
        transactionDetail.setQuantity(100);

        service.create(transactionDetail);

        verify(repository).save(transactionDetail);

    }

    @Test

    public void testDelete() {
        TransactionDetail input = EASY_RANDOM.nextObject(TransactionDetail.class);


        service.delete(input.getId());

        verify(repository).delete(input);

    }
}