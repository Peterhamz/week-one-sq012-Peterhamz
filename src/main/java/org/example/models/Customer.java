package org.example.models;

import org.example.enums.Gender;
import org.example.interfaces.BuyProductInterface;

public class Customer extends Person implements BuyProductInterface {
    private double money;

    public Customer() {
    }

    public Customer(double money) {
        this.money = money;
    }

    public Customer(String firstName, String lastName, String phoneNumber, String address, Gender gender, double money) {
        super(firstName, lastName, phoneNumber, address, gender);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "money=" + money +
                '}' + super.toString();
    }

    @Override
    public String buyProduct(Product product) {
        if(this.money <= )
    }
}
