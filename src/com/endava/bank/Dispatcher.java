package com.endava.bank;

import java.util.ArrayList;

public class Dispatcher {

    private int numberOfOrders;
    private ArrayList<Cashier> lstCashiers = new ArrayList<Cashier>();
    private ArrayList<Employee> lstEmployees = new ArrayList<Employee>();
    private ArrayList<Transaction> lstTransactions = new ArrayList<Transaction>();

    public void addOrder(){

    }

    private Employee getFirstAvailableEmployee(){
        return firstAvailable(lstCashiers);

    }

    private Employee firstAvailable(ArrayList<Employee> lst){
        for (Employee e: lst) {
            if (isAvailable(e)==true){
                return e;
            }
        }
        return null;
    }

    private boolean isAvailable(Employee employee){
        return employee.getAvailability();
    }

    public void attend(){

    }
}
