package com.praktikum.service;

import com.praktikum.model.Product;
import com.praktikum.repository.ProductRepository;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    private final EasyRandom EASY_RANDOM = new EasyRandom();
    private Long id;

    @InjectMocks
    private ProductService service;

    @Mock
    private ProductRepository repository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        id = EASY_RANDOM.nextObject(Long.class);
    }

    @Test
    void getAll_WillReturnListProduct() {
        var result = service.findAllProduct();

        verify(repository).findAll();

        System.out.println(result);
    }

    @Test
    void getOne_WillReturnProduct() {
        //Given
        Product product = EASY_RANDOM.nextObject(Product.class);

        when(repository.findById(product.getId())).thenReturn(Optional.of(product));

        //When
        var result = service.findById(product.getId());

        //Then
        verify(repository, times(1)).findById(product.getId());
        Product output = service.findById(product.getId());
        System.out.println(output);
        System.out.println(result);
        assertEquals(output, result);
    }
    @Test
    public void getAll_RepositoryThrowException_WillThrowException() {
        // Given
        String errMsg = "Database error!";
        when(repository.findAll()).thenAnswer( invocation -> { throw new Exception(errMsg); });

        // When
        Exception thrown = assertThrows(
                Exception.class,
                () -> service.findAllProduct(),
                "Expected getAll() to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().equals(errMsg));
        verify(repository, times(1)).findAll();


    }

}