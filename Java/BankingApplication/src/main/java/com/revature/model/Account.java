package com.revature.model;

import java.math.BigDecimal;

public class Account {
    /* Table Info:
     *
     * Name:
     *          [accounts]
     * Columns:
     *          [id][int] not null
     *          [account_type][varchar] not null
     *          [balance][money] null
     *          [approved][bool] null
     *          [active][bool] null
     */
    public int id;
    public String accountType;
    public BigDecimal balance;
    public boolean approved,
                   active;

    public Account(){}

    public Account(int id, String accountType, BigDecimal balance, boolean approved, boolean active){
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
        this.approved = approved;
        this.active = active;
    }
}
