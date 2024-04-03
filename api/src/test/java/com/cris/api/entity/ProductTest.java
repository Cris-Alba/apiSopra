package com.cris.api.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductTest {
    Product product;
    int id = 7;
        String name = "Patatas fritas";
        String description = "Bolsa de patatas fritas";
        double price= 1.5;
        String type ="Alimenticio";

    @BeforeEach
    public void setUp(){
        product = new Product(id, name, description, price, type);

    }
    @AfterEach
    public void tearDown(){
        product =null;
    }

    

    @Test
    void testGetDescription() {
        //Ass
        assertEquals(description, product.getDescription());
    }

    @Test
    void testGetId() {
        //Ass
        assertEquals(id, product.getId());

    }

    @Test
    void testGetName() {
        //Ass
        assertEquals(name, product.getName());

    }

    @Test
    void testGetPrice() {
        //Ass
        assertEquals(price, product.getPrice());
    }

    @Test
    void testGetType() {
        //Ass
        assertEquals(type, product.getType());
    }

    @Test
    void testSetDescription() {
        //Arr
        String changeDescription= "Pack de 2 bolsas de patatas gritas";
        //Act
        product.setDescription(changeDescription);
        //Ass
        assertEquals(changeDescription, product.getDescription());
    }

    @Test
    void testSetId() {
        //Arr
        int changeId= 8;
        //Act
        product.setId(changeId);
        //Ass
        assertEquals(changeId, product.getId());
    }

    @Test
    void testSetName() {
        //Arr
        String changeName= "Patatas fritas sin sal";
        //Act
        product.setName(changeName);
        //Ass
        assertEquals(changeName, product.getName());
    }

    @Test
    void testSetPrice() {
        //Arr
        double changePrice= 1.8;
        //Act
        product.setPrice(changePrice);
        //Ass
        assertEquals(changePrice, product.getPrice());
    }

    @Test
    void testSetType() {
        //Arr
        String changeType= "Comida";
        //Act
        product.setType(changeType);
        //Ass
        assertEquals(changeType, product.getType());

    }
}
