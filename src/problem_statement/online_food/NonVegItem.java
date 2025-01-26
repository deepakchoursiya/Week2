package day06.problem_statement.online_food;

// NonVegItem class representing non-vegetarian food items
public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implementing the calculateTotalPrice method
    @Override
    public double calculateTotalPrice() {
        double additionalCharge = 1.2; // 20% extra charge for non-veg items
        return getPrice() * getQuantity() * additionalCharge;
    }

    // Implementing the Discountable interface methods
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.85; // 15% discount for non-veg items
    }

    @Override
    public void getDiscountDetails() {
        System.out.println( "15% discount applied on non-veg items and you got a discount of " + calculateTotalPrice()*0.15);
    }
}
