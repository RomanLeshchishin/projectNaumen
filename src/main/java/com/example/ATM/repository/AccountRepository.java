package com.example.ATM.repository;

import com.example.ATM.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account,Long> {

}
