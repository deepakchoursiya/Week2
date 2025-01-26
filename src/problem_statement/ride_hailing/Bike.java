package day06.problem_statement.ride_hailing;

// Bike class representing a bike with fare calculation
public class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // Implementing calculateFare method for Bike
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8;  // Discounted fare for Bike (e.g., 20% off)
    }

    // Implementing GPS interface methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Updated location : " + currentLocation);
    }
}

