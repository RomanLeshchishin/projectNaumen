package com.example.ATM.repository;

import com.example.ATM.model.AccountHolder;
import org.springframework.data.repository.CrudRepository;

public interface AccountHolderRepository extends CrudRepository<AccountHolder,Long> {
}
