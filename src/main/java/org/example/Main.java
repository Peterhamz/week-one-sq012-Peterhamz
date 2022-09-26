package org.example;

import org.example.enums.Gender;
import org.example.enums.ProductTypes;
import org.example.models.Customer;
import org.example.models.Product;
import org.example.models.Staff;

public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff(2,"peter","James","09033210661","No 2 Ajoke Lagos",Gender.MALE);
        System.out.println(staff);
        Customer cus1 = new Customer("john","josh","09044535355","kdxvbwm sd ", Gender.FEMALE,600);

        //System.out.println(cus1);

        Product product1 = new Product(ProductTypes.BREAD,540);
        Product product2 = new Product(ProductTypes.DRUGS, 700);
        //System.out.println(product2);

        System.out.println(cus1.buyProduct(product1));






    }

}