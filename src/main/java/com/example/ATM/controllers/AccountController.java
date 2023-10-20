package com.example.ATM.controllers;

import com.example.ATM.model.Account;
import com.example.ATM.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AccountController {

    @Value("${Name}")
    private String Name;
    private final List<AccountService> accountService;

    private final Map<String,AccountService> accountServiceMap = new HashMap<>();

    @Autowired
    public AccountController(List<AccountService> accountService) {
        this.accountService = accountService;

        accountService.forEach(accountServices ->
        {
            accountServiceMap.put(accountServices.getName(), accountServices);
        });
    }

    @GetMapping("/allAccount")
    @ResponseBody
    public List<Account> getAccount(){

        return getService().getAllAccount();
    }


    @GetMapping("/addAccount/{countNumber}/{countSum}/{countName}")
    @ResponseBody
    public List<Account> addAccount(@PathVariable int countNumber,@PathVariable int countSum,
                                    @PathVariable String countName)
    {
        Account newAccount = new Account(countNumber,countSum,countName);
        newAccount.setCountName(countName);
        getService().saveAccount(newAccount);
        return getAccount();
    }

    private AccountService getService(){
return accountServiceMap.get(Name);
    }

}
