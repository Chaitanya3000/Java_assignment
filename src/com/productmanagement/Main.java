package com.productmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        CustomerManager customerManager = new CustomerManager();
        TransactionManager transactionManager = new TransactionManager();

        // Sample data
        productManager.addProduct(new Product(1, "Laptop", 999.99, 10));
        productManager.addProduct(new Product(2, "Smartphone", 499.99, 20));
        
        customerManager.addCustomer(new Customer(1, "Alice", "alice@example.com"));
        customerManager.addCustomer(new Customer(2, "Bob", "bob@example.com"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Product Management System");

        while (true) {
            System.out.println("1. List Products");
            System.out.println("2. List Customers");
            System.out.println("3. Make a Purchase");
            System.out.println("4. List Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    productManager.listProducts();
                    break;
                case 2:
                    customerManager.listCustomers();
                    break;
                case 3:
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    Customer customer = customerManager.getCustomer(customerId);

                    System.out.print("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    Product product = productManager.getProduct(productId);

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    try {
                        Transaction transaction = new Transaction(customer, product, quantity);
                        transactionManager.addTransaction(transaction);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    transactionManager.listTransactions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
