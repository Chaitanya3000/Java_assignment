package com.productmanagement;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProduct(int id) {
        return products.get(id);
    }

    public void listProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
