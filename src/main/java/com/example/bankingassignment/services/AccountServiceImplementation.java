package com.example.bankingassignment.services;

import com.example.bankingassignment.models.Account;
import com.example.bankingassignment.repo.AccountRepository;
import com.example.bankingassignment.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImplementation implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> findAllWithMinimumBalance(Double minimumBalance) {
        return accountRepository.findByBalanceLessThan(minimumBalance);
    }

}
