package day06.problem_statement.online_food;

// OrderProcessing class to handle different food items
public class OrderProcessing {

    // Method to process the order and calculate the total price after applying discount
    public static void processOrder(FoodItem[] items) {
        double totalAmount = 0;
        for (FoodItem item : items) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                totalAmount += discountableItem.applyDiscount();
                discountableItem.getDiscountDetails();
            } else {
                totalAmount += item.calculateTotalPrice();
            }
        }
        System.out.println("Total amount to be paid: " + totalAmount);
    }
}
