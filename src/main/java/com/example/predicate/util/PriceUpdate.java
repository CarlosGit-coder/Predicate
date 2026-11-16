package com.example.predicate.util;

import java.util.function.Consumer;

import com.example.predicate.entities.Product;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

}
