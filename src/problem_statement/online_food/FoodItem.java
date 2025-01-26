package day06.problem_statement.online_food;
// Abstract class FoodItem with common fields and methods
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate the total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
    }



    public double getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }

}
