package day06.problem_statement.e_comerce;

// Groceries class
class Groceries extends Product implements Taxable{

    private static final double taxRateGrocery = 0.07;

    // Constructor
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRateGrocery;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax Rate: " + (taxRateGrocery * 100) + "%";
    }

}
