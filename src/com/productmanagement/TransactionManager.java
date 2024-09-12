package com.productmanagement;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Transaction successful: " + transaction);
    }

    public void listTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
