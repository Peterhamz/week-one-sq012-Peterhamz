package org.example;

import org.example.enums.Gender;
import org.example.enums.ProductTypes;
import org.example.models.*;

public class Main {
    public static void main(String[] args) {
        Address add1 = new Address(22,"Ajoke","Gbagada","Lagos","Nigeria");
        Staff staff = new Staff(2,"peter","James","09033210661","no 1 Joke Salako Gbagada",Gender.MALE);
        System.out.println(staff);
        Customer cus1 = new Customer("John","josh","09044535355","kdxvbwm sd ", Gender.FEMALE,60);

        //System.out.println(cus1);

        Product product1 = new Product(ProductTypes.BREAD,540);
        Product product2 = new Product(ProductTypes.DRUGS, 700);
        //System.out.println(product2);

        System.out.println(cus1.buyProduct(product1));

        Applicant app1 = new Applicant("ABU","Samuel","07072738394",add1,Gender.FEMALE,"TRUE");
        System.out.println(app1);
        Manager manager = new Manager(1,"Samson","Holafo","08067894768","7, New way Layout Abuja",Gender.MALE);

        System.out.println(manager.hierCashier(app1));


        Cashier cashier = new Cashier(77,"Faith","Okolo","09073628263","6 holand Street Jos ",Gender.FEMALE);
        System.out.println();
        System.out.println("*********************************");
        System.out.println(cashier.sellProduct(cus1,product1));


    }

}