package com.example.Practice.Springboot.APIs6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private  int id;
    private  String name;
    private  int stockQuantity;
}
