package com.praktikum.service;

import com.praktikum.model.Product;
import com.praktikum.model.TransactionDetail;
import com.praktikum.repository.ProductRepository;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
class ProductServiceTest {
    private final EasyRandom EASY_RANDOM = new EasyRandom();
    private String id;

    @InjectMocks
    private ProductService service;

    @Mock
    private ProductRepository repository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        id = EASY_RANDOM.nextObject(String.class);
    }

    @Test
    void findProductById() {
        //Given
        Product product = EASY_RANDOM.nextObject(Product.class);
        when(repository.findById(product.getId())).thenReturn(Optional.of(product));

        //When
        var result = service.findProductById(product.getId());

        //Then
        verify(repository, times(1)).findById(product.getId());
        Product output = service.findProductById(product.getId());
        assertEquals(output,result);
    }

    @Test
    void findAllProduct() {
        List<Product> products = EASY_RANDOM.objects(Product.class, 2)
                .collect(Collectors.toList());
        when(repository.findAll()).thenReturn(products);

        //When
        var result = service.findAllProduct();

        //Then
        verify(repository, times(1)).findAll();
        assertEquals(products, result);
    }

    @Test
    void updateProduct() {
    }

    @Test
    void createProduct() {
        //Given
        Product input = EASY_RANDOM.nextObject(Product.class);


        service.removeProduct(input.getId());

        verify(repository).delete(input);

    }

    @Test
    void removeProduct() throws Exception {
        Product input = EASY_RANDOM.nextObject(Product.class);
        when(repository.findById(input.getId())).thenReturn(Optional.of(input));
        System.out.println(input);
        var result = service.removeProduct(input.getId());

        verify(repository, times(1)).delete(input);
        System.out.println(input + "Delete");
    }
}