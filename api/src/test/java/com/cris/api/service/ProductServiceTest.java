package com.cris.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cris.api.entity.Product;

public class ProductServiceTest {

    private ProductService serviceProduct;

    @BeforeEach
    void setUp(){
        serviceProduct = new ProductService();

    }

    @Test
    void testCreateProducts() {
        // Arr
        // Act
        int result = serviceProduct.createProducts().size();
        // Ass
        assertEquals(6, result);
    }


    @Test
    void testFindProductByIdExist() {
        // Arr
        int id =1;
        // Act
        Product result = serviceProduct.findProductById(id);
        // Ass
        assertNotNull(result);
        assertEquals(id,result.getId());
    }

    @Test
    void testFindProductByIdNotExist() {
        // Arr
        int id =200;
        // Act
        Product result = serviceProduct.findProductById(id);
        // Ass
        assertNull(result);
    }
}
