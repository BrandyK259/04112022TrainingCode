package com.revature.dao;

import com.revature.model.Account;

public class AccountDAOImpl implements DAOInterface<Account, Integer>{

    //apply for account
    @Override
    public void create(Account element) {

    }

    //get account
    @Override
    public Account retrieve(Integer id) {
        return null;
    }

    // Approve/Deny: alters boolean columns 'approved' and 'active'
    // Canceling: alters boolean column 'active'
    // Withdraw/Deposit: alters BigDecimal column 'balance'
    @Override
    public void update(Account element) {

    }

    @Override
    public void delete(Account element) {

    }
}
