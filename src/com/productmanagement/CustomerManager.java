package com.productmanagement;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private Map<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public void listCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }
}
