package day06.problem_statement.e_comerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();

        // Add products to the list
        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "T-Shirt", 1000));
        products.add(new Groceries(3, "Rice", 500));

        // Process and display final price for all products
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0.0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------------");
        }
    }
}
