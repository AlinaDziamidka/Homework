package com.itacademy.brest.hw_10_12.task4_map.product;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {

    private HashMap<String, Float> products;

    public HashMap<String, Float> getProducts() {
        return products;
    }

    public ProductDatabase(HashMap<String, Float> products) {
        this.products = products;
    }

    public void setProducts(HashMap<String, Float> products) {
        this.products = products;
    }

    public void addProduct(String name, Float price) {
        Product product = new Product(name, price);
        products.put(name, price);
    }

    public void findProductWithHighestPrice() {
        float currentPrice = 0;
        float maxPrice = 0;
        for (Map.Entry<String, Float> entry : products.entrySet()) {
            currentPrice = entry.getValue();
            if (maxPrice < currentPrice) {
                maxPrice = currentPrice;
            }
        }
        System.out.println(maxPrice);
    }
}