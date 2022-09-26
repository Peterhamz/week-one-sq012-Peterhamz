package org.example.models;

import org.example.enums.ProductTypes;

public class Product {
   private ProductTypes types;
   private double price;

   public Product(ProductTypes types, double price) {
      this.types = types;
      this.price = price;
   }

   public Product() {
   }

   public ProductTypes getTypes() {
      return types;
   }

   public void setTypes(ProductTypes types) {
      this.types = types;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   @Override
   public String toString() {
      return "Product{" +
              "types=" + types +
              ", price=" + price +
              '}';
   }
}
