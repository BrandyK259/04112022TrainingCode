package com.revature.model;

public class User {
    /* Table Info:
     *
     * Name:
     *          [users]
     * Columns:
     *          [id][int] serial
     *          [username][varchar] not null
     *          [password][varchar] not null
     *          [is_customer][bool] null
     *          [is_employee][bool] null
     *          [is_admin][bool] null
     */

    public int id;
    public String username,
        password;
    public boolean isCustomer,
        isEmployee,
        isAdmin;

    public User(){}

    public User(int id,String username,String password,boolean isCustomer,boolean isEmployee,boolean isAdmin){
        this.id = id;
        this.username = username;
        this.password = password;
        this.isCustomer = isCustomer;
        this.isEmployee = isEmployee;
        this.isAdmin = isAdmin;
    }
}
