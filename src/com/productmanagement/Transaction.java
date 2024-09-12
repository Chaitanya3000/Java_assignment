package com.productmanagement;

public class Transaction {
    private Customer customer;
    private Product product;
    private int quantity;
    private double totalPrice;

    public Transaction(Customer customer, Product product, int quantity) throws Exception {
        if (product.getQuantity() < quantity) {
            throw new Exception("Insufficient stock");
        }
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
        product.setQuantity(product.getQuantity() - quantity);
    }

    public double getTotalPrice() { return totalPrice; }

    @Override
    public String toString() {
        return "Transaction{" +
                "customer=" + customer +
                ", product=" + product +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
