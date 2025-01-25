package day06.problem_statement.vehicle_rental_system;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add vehicles to the list
        vehicles.add(new Car("CAR123", "Car", 1500, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE123", "Bike", 500, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK123", "Truck", 3000, "TRUCK-INS-003"));

        // Process and display rental and insurance details for all vehicles
        int rentalDays = 5; // Example rental duration
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Rate: " + vehicle.getRentalRate());
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                System.out.println( ((Insurable) vehicle) .getInsuranceDetails());
                System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
            }

            System.out.println("-----------------------------------");
        }
    }
}
