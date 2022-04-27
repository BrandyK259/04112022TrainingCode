package com.revature.model;

public class Customer {
    /* Table Info:
     *
     * Name:
     *          [customers]
     * Columns:
     *          [username][varchar] not null
     *          [password][varchar] not null
     *          [first_name][varchar] not null
     *          [last_name][varchar] not null
     *          [email][varchar] null
     *          [checking_acct_id][int] null
     *          [savings_acct_id][int] null
     *          [joint_acct_id][int] null
     */

    public String  username,
                   password,
                   firstName,
                   lastName,
                   email;
    public int checkingAcctId,
               savingsAcctId,
               jointAcctId;

    public Customer(){}

    public Customer( String username, String password, String firstName, String lastName, String email, int checkingAcctId, int savingsAcctId, int jointAcctId)
    {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.checkingAcctId = checkingAcctId;
        this.savingsAcctId = savingsAcctId;
        this.jointAcctId = jointAcctId;
    }
}
