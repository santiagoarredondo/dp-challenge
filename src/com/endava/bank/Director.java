package com.endava.bank;

import java.util.Date;

public abstract class Director  extends Employee implements AttendTransaction{
    public Director(int id, String name, int cellphone, Date birthdate, double salary, Date admissionDate, boolean isOnVacations) {
        super(id, name, cellphone, birthdate, salary, admissionDate, isOnVacations);
    }

    @Override
    public void attendTransaction() {
        System.out.println("Hi, I'm "+super.getName()+" and I'm a Director");
    }
}
