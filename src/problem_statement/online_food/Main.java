package day06.problem_statement.online_food;

// Main class to test the Online Food Delivery System
public class Main {
    public static void main(String[] args) {
        // Creating food items
        FoodItem[] orderItems = new FoodItem[] {
                new VegItem("Veg Pizza", 250, 2),
                new NonVegItem("Chicken Burger", 100, 3)
        };

        // Processing the order
        OrderProcessing.processOrder(orderItems);
    }
}
