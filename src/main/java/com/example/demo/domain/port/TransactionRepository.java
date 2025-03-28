package com.example.demo.domain.port;

import com.example.demo.domain.model.Transaction;

public interface TransactionRepository {
    Transaction save(Transaction transaction);
}
