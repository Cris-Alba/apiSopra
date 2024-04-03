package com.cris.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private String type;

}

