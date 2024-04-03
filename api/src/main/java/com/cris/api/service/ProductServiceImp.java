package com.cris.api.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cris.api.entity.Product;

@Service
public class ProductService implements IProductService {

    private ArrayList<Product> products= createProducts();



    public Product findProductById(int id) {
        Optional<Product> productFound = products.stream().filter(product -> product.getId() == id).findFirst();
        if (productFound.isPresent()) {
            return productFound.get();
        }
        return null;

    }

    public ArrayList<Product> createProducts() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Macarrones", "Paquete de macarrones", 1.2, "Alimenticio"));
        products.add(new Product(2, "Pañales 5", "Paquete de pañales talla 5", 29.99, "Higienico"));
        products.add(new Product(3, "Toallitas", "Toallitas para bebe", 2.95, "Higienico"));
        products.add(new Product(4, "Yogures", "Pack de 8 yogures", 1.99, "Alimenticio"));
        products.add(new Product(5, "Cubiertos bebe", "Cuchara, tenerdor y cichillo para bebes", 27.90, "Utensilio"));
        products.add(new Product(6, "Televisor 75", "Televisor de 75 pulgadas", 1479.0, "Electrónico"));
        return products;

    }



}
