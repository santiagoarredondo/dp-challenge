package com.endava.bank;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private int cellphone;
    private Date birthdate;

    public Person(int id, String name, int cellphone, Date birthdate) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cellphone=" + cellphone +
                ", birthdate=" + birthdate +
                '}';
    }
}
