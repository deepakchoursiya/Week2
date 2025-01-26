package day06.problem_statement.ride_hailing;

// Car class representing a car with fare calculation
public class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // Implementing calculateFare method for Car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;  // Basic fare calculation for Car
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
