package com.endava.bank;

import java.util.Date;

public class Employee extends Person {
    private double salary;
    private Date admissionDate;
    private boolean available;

    public Employee(int id, String name, int cellphone, Date birthdate, double salary, Date admissionDate, boolean isOnVacations) {
        super(id, name, cellphone, birthdate);
        this.salary = salary;
        this.admissionDate = admissionDate;
        this.available = isOnVacations;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public boolean getAvailability() {
        return available;
    }

    public void setAvailability(boolean onVacations) {
        available = onVacations;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", admissionDate=" + admissionDate +
                ", Availability=" + available +
                '}';
    }
}
