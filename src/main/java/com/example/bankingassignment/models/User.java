package com.example.bankingassignment.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String emailId;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    public User(String firstname, String lastname,String emailId, String username, String password, Account account) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailId = emailId;
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public User() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailId() { return emailId; }

    public void setEmailId(String emailId) { this.emailId = emailId; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
