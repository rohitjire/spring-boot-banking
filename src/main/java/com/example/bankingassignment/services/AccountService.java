package com.example.bankingassignment.services;

import com.example.bankingassignment.models.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    List<Account> findAllWithMinimumBalance(Double minimumBalance);
}
