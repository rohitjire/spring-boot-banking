package com.example.bankingassignment.services;


import com.example.bankingassignment.models.Account;
import com.example.bankingassignment.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScheduleTaskService {

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserService userService;

    @Scheduled(cron = "*/10 * * * * *")
    public void checkMinimumBalance(){

        Double minimumBalance = 2000.0;

        List<Account> lowBalanceAccounts = accountService.findAllWithMinimumBalance(minimumBalance);

        lowBalanceAccounts.stream().forEach(account -> {
            System.out.println(account.getBalance());
        });

    }

}
