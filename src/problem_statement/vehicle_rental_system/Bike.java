package day06.problem_statement.vehicle_rental_system;

// Bike class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Getter for insurancePolicyNumber
    private String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Standard daily rental rate
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of the rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy Number: " + getInsurancePolicyNumber();
    }
}
