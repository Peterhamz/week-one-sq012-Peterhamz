package org.example.models;

import org.example.enums.Gender;
import org.example.enums.ProductTypes;
import org.example.interfaces.SellProductInterface;

public class Cashier extends Staff implements SellProductInterface {


    public Cashier() {
    }

    public Cashier(int id) {
        super(id);
    }

    public Cashier(int id, String firstName, String lastName, String phoneNumber, String address, Gender gender) {
        super(id, firstName, lastName, phoneNumber, address, gender);
    }

    @Override
    public String toString() {
        return "Cashier{}" + super.toString();
    }

    @Override
    public String sellProduct(Customer customer, Product product) {
    if(product.getPrice() <= customer.getMoney()){

        return "Hello " + " " + customer.getFirstName() + "," + " your purchase of " + " " + ProductTypes.BREAD
                + " " + "costs " + " " + product.getPrice() + " " + " and is available for sale";
    } else
            return "Hello " + " " + customer.getFirstName() + " " + "your current balance of " + " " + customer.getMoney()
                    + " " + " is insufficient for the Purchase of " + " " + ProductTypes.BREAD;
}

}
