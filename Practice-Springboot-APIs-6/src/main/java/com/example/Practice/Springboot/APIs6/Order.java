package com.example.Practice.Springboot.APIs6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private  int orderId;
    private  String shippingAddress;
    private  String orderStatus;
}
