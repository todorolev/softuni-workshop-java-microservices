package com.storesoft.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public void order() {
        System.out.println("Order Created");
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/cart";
        restTemplate.delete(url);
    }
}
