package day06.problem_statement.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of library items
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Add items to the list
        libraryItems.add(new Book("B001", "Java Programming", "James Gosling"));
        libraryItems.add(new Magazine("M001", "Tech Monthly", "Various Authors"));
        libraryItems.add(new DVD("D001", "Inception", "Christopher Nolan"));

        // Process each item
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Handle reservable items
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
                reservable.reserveItem("John Doe");
                System.out.println("Availability after reservation: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            }

            System.out.println("-----------------------------------");
        }
    }
}
