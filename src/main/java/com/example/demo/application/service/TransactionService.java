package com.example.demo.application.service;

import com.example.demo.domain.model.Transaction;
import com.example.demo.domain.port.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction createTransaction(Transaction transaction) {
        // Implement business logic here
        return transactionRepository.save(transaction);
    }
}
