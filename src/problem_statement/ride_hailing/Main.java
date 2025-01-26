package day06.problem_statement.ride_hailing;


// Main Application to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle car = new Car("C001", "Johny", 15.0);
        Vehicle bike = new Bike("B001", "Advik", 10.0);
        Vehicle auto = new Auto("A001", "Sobhit", 12.0);

        // Calculate fares dynamically
        car.getVehicleDetails();
        System.out.println("Fare for Car: " + car.calculateFare(10.0) + " INR");
        System.out.println("Current location : " +  ((GPS)car).getCurrentLocation()  );
          ((GPS)car).updateLocation("MG Road");
        System.out.println("-------------------------------------------");

        bike.getVehicleDetails();
        System.out.println("Fare for Bike: " + bike.calculateFare(10.0) + " INR");
        System.out.println("Current location : " +  ((GPS)bike).getCurrentLocation()  );
        ((GPS)bike).updateLocation("Kolar");
        System.out.println("-------------------------------------------");

        auto.getVehicleDetails();
        System.out.println("Fare for Auto: " + auto.calculateFare(10.0) + " INR");
        System.out.println("Current location : " +  ((GPS)auto).getCurrentLocation()  );
        ((GPS)auto).updateLocation("Indrapuri");
        System.out.println("-------------------------------------------");


    }
}


