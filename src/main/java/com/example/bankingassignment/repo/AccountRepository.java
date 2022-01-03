package com.example.bankingassignment.repo;

import com.example.bankingassignment.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    List<Account> findByBalanceLessThan(Double minimumBalance);
}
