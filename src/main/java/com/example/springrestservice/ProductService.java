package com.example.springrestservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
