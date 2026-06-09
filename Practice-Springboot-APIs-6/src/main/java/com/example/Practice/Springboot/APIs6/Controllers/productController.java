package com.example.Practice.Springboot.APIs6.Controllers;

import com.example.Practice.Springboot.APIs6.Entities.Product;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String updateStock(@PathVariable int id, @RequestParam int quantity) {
        if (!products.containsKey(id)) {
            return "Product not found";
        }
        Product product = products.get(id);
        int oldStock = product.getStockQuantity();
        product.setStockQuantity(quantity);

        return "Product Updated Successfully\n" +
                "Product Name: " + product.getName() + "\n" +
                "Previous Stock: " + oldStock + "\n" +
                "Updated Stock: " + quantity;
    }
    }
