package com.example.Practice.Springboot.APIs6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class orderController {
    private HashMap<Integer, Order> orders = new HashMap<>();

    public orderController() {
        orders.put(101, new Order(101, "Muscat", "Pending"));
    }

    @PutMapping("/updateOorder/{orderId}")
    public String updateOrder(@PathVariable int orderId, @RequestParam String address, @RequestParam String status) {
        if (!orders.containsKey(orderId)) {
            return "Order not found";
        }
        // Retrieve the existing order from the HashMap using its ID
        Order order = orders.get(orderId);
        // Update the shipping address with the new value received from the request
        order.setShippingAddress(address);
        // Update the order status with the new value received from the request
        order.setOrderStatus(status);
        return "Order Updated Successfully\n" +
                "Order ID: " + order.getOrderId() + "\n" +
                "Updated Shipping Address: " + order.getShippingAddress() + "\n" +
                "Updated Order Status: " + order.getOrderStatus();
    }

}

