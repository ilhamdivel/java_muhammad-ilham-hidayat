package com.praktikum.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.praktikum.model.Product;
import com.praktikum.repository.ProductRepository;
import com.praktikum.service.ProductService;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(controllers = ProductController.class)
class ProductControllerTest {
    @MockBean
    private ProductService service;

    @MockBean
    private ProductRepository repository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    @DisplayName("Should Return 200 / OK When Making GET Request to endpoint - /api/v1/product")
    public void shouldListAllProduct() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/api/v1/product")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc
                .perform(requestBuilder)
                .andReturn();
        assertEquals(200, response.getResponse().getStatus());
    }

    @Test
    @DisplayName("Should Return 400 / Bad Request When Making POST Request without request Body to endpoint  - /api/v1/product")
    public void createNewProductWithoutPayload() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/api/v1/product")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc
                .perform(requestBuilder)
                .andReturn();

        assertEquals(400, response.getResponse().getStatus());
    }

    @Test
    @DisplayName("Should Return 200 / Ok When Making POST Request with Request Body to endpoint  - /api/v1/product")
    public void createNewProductWithPayload() throws Exception {
        Product product = new Product("1","Ilham", 100L);


        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/api/v1/product")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(product))
                .accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc
                .perform(requestBuilder)
                .andReturn();

        assertEquals(200, response.getResponse().getStatus());
    }

}