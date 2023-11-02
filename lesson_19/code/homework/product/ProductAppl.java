package homework.product;

import homework.product.model.Food;
import homework.product.model.MeatFood;
import homework.product.model.MilkFood;
import homework.product.model.Product;

public class ProductAppl {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Water", 2537694024546L, 0.59);
        products[1] = new Food("Bread", 1234567890123L, 1.99, "04.10.2023");
        products[2] = new MeatFood("Beef", 3780935215617L, 8.99, "13.10.2023", "Chicken");
        products[3] = new MilkFood("Milk", 1238564739269L, 1.39, "27.11.2023", "Whole", 3.5);

       printProducts(products);
       double totalPrice = calculateTotalPrice(products);
        System.out.println("Total Price: €" +  totalPrice);
    }
    public static void printProducts(Product[] products){
        for (Product product : products){
            System.out.println(product);
            System.out.println("===========================================================================");
        }
    }
    public static double calculateTotalPrice(Product[] products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}




