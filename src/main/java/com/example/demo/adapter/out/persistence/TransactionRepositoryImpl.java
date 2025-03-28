package com.example.demo.adapter.out.persistence;

import com.example.demo.domain.model.Transaction;
import com.example.demo.domain.port.TransactionRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    @Override
    public Transaction save(Transaction transaction) {
        // Implement the persistence logic here
        return transaction;
    }
}
