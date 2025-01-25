package day06.problem_statement.e_comerce;

// Clothing class
class Clothing extends Product implements Taxable {
    private static final double taxRateClothing= 0.05; // 5% tax

    // Constructor
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRateClothing;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (taxRateClothing * 100) + "%";
    }
}
