package com.cris.api.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cris.api.entity.Product;
import com.cris.api.service.IProductService;

public class ProductControllerTest {
    @Mock
    private IProductService serviceProduct;
    @InjectMocks
    private ProductController controllerProduct;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetProductByIdWhenProductExist() {
        // Arr
        int typeResponse = HttpStatus.NOT_FOUND.value();

        int id = 6;
        Product mockProduct = new Product(id, "Televisor 75", "Televisor de 75 pulgadas", 1479.0, "Electrónico");
        when(serviceProduct.findProductById(id)).thenReturn(mockProduct);
        // Act
        ResponseEntity<Product> response = controllerProduct.getProductById(id);
        Product result = response.getBody();
        // Ass
        assertEquals(mockProduct, result);
        //**************************Comprobar el nombre de status en lugar del número
        assertEquals(200, response.getStatusCode().value());
        verify(serviceProduct).findProductById(id);
        verify(serviceProduct, times(1)).findProductById(id);

    }

    @Test
    void testGetProductByIdWhenProductNotExist() {
        // Arr
        int id = 50;
        when(serviceProduct.findProductById(id)).thenReturn(null);
        // Act
        ResponseEntity<Product> response = controllerProduct.getProductById(id);
        Product result = response.getBody();
        // Ass
        assertNull(result);
        assertEquals(200, response.getStatusCode().value());
        verify(serviceProduct).findProductById(id);
        verify(serviceProduct, times(1)).findProductById(id);

    }


}
