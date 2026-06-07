package com.example.Practice.Springboot.APIs6;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class productController {
   private HashMap<Integer, Product> products = new HashMap<>();
   //Preload it with at least one sample product
    public productController() {
        products.put(1, new Product(1, "Laptop", 10));
    }
    @PutMapping("/updateStock/{id}")
    public String updateStock(@RequestParam int id, @RequestParam int quantity) {

    }
