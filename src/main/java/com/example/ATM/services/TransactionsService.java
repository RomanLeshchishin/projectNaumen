package com.example.ATM.services;

import com.example.ATM.model.Account;
import com.example.ATM.repository.TransactionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsService implements AccountService{

    protected final TransactionsRepository repository;

    public TransactionsService(TransactionsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Account> getAllAccount() {
        return null;
    }

    @Override
    public void saveAccount(int countNumber, int countSum, String countName) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }
}
