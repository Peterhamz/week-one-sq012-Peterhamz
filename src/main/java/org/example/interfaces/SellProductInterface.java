package org.example.interfaces;

import org.example.models.Customer;
import org.example.models.Product;

public interface SellProductInterface {
    String sellProduct(Customer customer, Product product);
}
