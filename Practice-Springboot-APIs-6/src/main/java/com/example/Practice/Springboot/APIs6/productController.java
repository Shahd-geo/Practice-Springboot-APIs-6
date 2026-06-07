package com.example.Practice.Springboot.APIs6;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class productController {
    HashMap<Integer, Product> products = new HashMap<>();
}
