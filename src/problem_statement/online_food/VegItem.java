package day06.problem_statement.online_food;

// VegItem class representing vegetarian food items
public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implementing the calculateTotalPrice method
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Implementing the Discountable interface methods
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.90; // 10% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("10% discount applied on veg items you save " + calculateTotalPrice()*.10);
    }
}
