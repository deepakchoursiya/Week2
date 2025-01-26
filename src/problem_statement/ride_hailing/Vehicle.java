package day06.problem_statement.ride_hailing;

// Abstract class Vehicle with common fields and methods
public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver Name : " + driverName);
        System.out.println("Rate per km : " + ratePerKm);
    }


    public double getRatePerKm() {
        return ratePerKm;
    }


}

