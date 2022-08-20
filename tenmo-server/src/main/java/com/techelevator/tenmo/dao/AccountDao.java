package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.exceptions.AccountNotFoundException;
import com.techelevator.tenmo.model.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();

    Account findByUserId(long userId) throws AccountNotFoundException;

    double getBalanceByUserId(long userId) throws AccountNotFoundException;

    Account update(Account account);

    Account create(Account account);

    void delete(Account account);
}
