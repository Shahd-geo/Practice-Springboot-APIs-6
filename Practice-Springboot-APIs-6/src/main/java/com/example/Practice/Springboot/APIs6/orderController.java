package com.example.Practice.Springboot.APIs6;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class orderController {
    private HashMap<Integer, Order> orders =new  HashMap<>();
    public orderController() {
        orders.put(1, new Order(1, "Muscat", " Delivered"));
    }
    @PutMapping("/updateOorder/{orderId}")

}
