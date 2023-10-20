package com.example.ATM.repository;

import com.example.ATM.model.Transactions;
import org.springframework.data.repository.CrudRepository;

public interface TransactionsRepository extends CrudRepository<Transactions,Long> {
}
