package day06.problem_statement.e_comerce;

// Electronics class
class Electronics extends Product implements Taxable {
    private static final double taxRate= 0.18; // 18% tax

    // Constructor
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: " + (taxRate * 100) + "%";
    }
}

