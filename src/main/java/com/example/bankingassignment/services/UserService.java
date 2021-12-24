package com.example.bankingassignment.services;

import com.example.bankingassignment.models.User;

public interface UserService {

    User findByUsername(String username);

    User saveUser(User user);

}
