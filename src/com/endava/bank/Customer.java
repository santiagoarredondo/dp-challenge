package com.endava.bank;

import java.util.Date;

public class Customer extends Person{
    private int account;

    public Customer(int id, String name, int cellphone, Date birthdate, int account) {
        super(id, name, cellphone, birthdate);
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "account=" + account +
                '}';
    }
}
