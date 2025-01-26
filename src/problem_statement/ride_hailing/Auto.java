package day06.problem_statement.ride_hailing;

// Auto class representing an auto-rickshaw with fare calculation
public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    // Implementing calculateFare method for Auto
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.2;  // Higher fare for Auto (e.g., 20% more)
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

