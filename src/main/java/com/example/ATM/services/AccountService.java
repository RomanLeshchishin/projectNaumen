package com.example.ATM.services;

import com.example.ATM.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccount();

    void saveAccount(int countNumber, int countSum, String countName);

    String getName();

    void saveAccount(Account account);

}
