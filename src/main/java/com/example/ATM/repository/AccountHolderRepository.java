package com.example.ATM.repository;

import com.example.ATM.model.AccountHolder;
import com.example.ATM.model.Transactions;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountHolderRepository extends CrudRepository<AccountHolder,Long> {
    List<AccountHolder> findByFirstName(String firstName);
    List<AccountHolder> findByLastName(String lastName);
    //List<Transactions> findTransactionsByCountNumber(int countNumber);?
}
