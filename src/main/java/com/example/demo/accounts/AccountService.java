package com.example.demo.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository repository;

    public Account createAccount(AccountDto.Create createAccountDto) {
        Account account = new Account();
        account.setUsername(createAccountDto.getUsername());
        account.setPassword(createAccountDto.getPassword());

        Date now = new Date();
        account.setJoined(now);
        account.setUpdated(now);

        Account createdAccount = repository.save(account);

        return createdAccount;
    }
}
