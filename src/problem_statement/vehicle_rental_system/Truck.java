package day06.problem_statement.vehicle_rental_system;

// Truck class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Getter for insurancePolicyNumber
    private String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Additional fixed cost of 500
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of the rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy Number: " + getInsurancePolicyNumber();
    }
}
