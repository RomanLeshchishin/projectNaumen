package com.example.ATM.services;

import com.example.ATM.model.Account;
import com.example.ATM.repository.AccountHolderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountHolderService implements AccountService {

    protected final AccountHolderRepository repository;

    public AccountHolderService(AccountHolderRepository repository) {
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
