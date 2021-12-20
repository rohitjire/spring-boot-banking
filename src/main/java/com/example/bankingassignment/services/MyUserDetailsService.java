package com.example.bankingassignment.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("foo", "$2a$12$d0S4L8wzxvp0lGChqxru2Oy.uD4dd3eVQqVWeiRVIJpTgU0vrP2ky", new ArrayList<>());
    }
}
