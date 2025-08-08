package com.yourcompany.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yourcompany.orderservice.client.ProductClient;

@RestController
public class OrderController {

    @Autowired
    private ProductClient productClient; // Spring injects the implementation for you!

    @GetMapping("/order")
    public String createOrder() {
        // Use the client to call the product-service
        String productDetails = productClient.getProduct("123-ABC");
        return "ORDER CREATED. Including: " + productDetails;
    }
}