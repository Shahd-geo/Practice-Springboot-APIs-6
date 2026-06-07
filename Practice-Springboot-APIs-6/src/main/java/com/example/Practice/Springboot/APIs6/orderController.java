package com.example.Practice.Springboot.APIs6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class orderController {
    private HashMap<Integer, Order> orders =new  HashMap<>();
    public orderController() {
        orders.put(101, new Order(101, "Muscat", "Pending"));
    }
    @PutMapping("/updateOorder/{orderId}")
    public String updateOrder(@PathVariable int orderId, @RequestParam String address,@RequestParam String status) {
        if (!orders.containsKey(orderId)) {
            return "Order not found";
        }
        Order order = orders.get(orderId);

    }

}
