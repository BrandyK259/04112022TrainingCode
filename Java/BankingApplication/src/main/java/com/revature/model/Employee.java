package com.revature.model;

public class Employee {
    /* Table Info:
     *
     * Name:
     *          [employees]
     * Columns:
     *          [username][varchar] not null
     *          [password][varchar] not null
     *          [first_name][varchar] not null
     *          [last_name][varchar] not null
     *          [curr_customer_un][varchar] null
     *          [joint_customer_un][varchar] null
     */
    public String username,
        password,
        firstName,
        lastName,
        currCustomerUn,
        jointCustomerUn;

    public Employee(){}

    public Employee(String username, String password, String firstName, String lastName, String currCustomerUn, String jointCustomerUn){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currCustomerUn = currCustomerUn;
        this.jointCustomerUn = jointCustomerUn;
    }
}
