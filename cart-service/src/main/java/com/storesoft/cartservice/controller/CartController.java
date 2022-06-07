package com.storesoft.cartservice.controller;

import com.storesoft.cartservice.model.Item;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping
    public void add(@RequestBody Item item) {
        System.out.println(String.format("Added %d of %s", item.getQty(), item.getId()));
    }

    @DeleteMapping
    public void emptyCart() {
        System.out.println("Cart Empty");
    }
}
