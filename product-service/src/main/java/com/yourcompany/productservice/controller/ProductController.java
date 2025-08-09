package com.yourcompany.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // A simple endpoint to get product data
    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable String id) {
        // In a real app, you'd look this up in a database
        return "Our Product Details for ID: " + id;
    }

    // Health check endpoint
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }



}

