package com.cris.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cris.api.entity.Product;
import com.cris.api.service.IProductService;

@Controller
public class ProductController {
    @Autowired
    private IProductService serviceProduct;

    // localhost:8080/product/6
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product productFound = serviceProduct.findProductById(id);
        return ResponseEntity.ok(productFound);
    }



}
