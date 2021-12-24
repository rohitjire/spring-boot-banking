package com.example.bankingassignment.services;

import com.example.bankingassignment.models.Account;
import com.example.bankingassignment.repo.AccountRepository;
import com.example.bankingassignment.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImplementation implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

}
