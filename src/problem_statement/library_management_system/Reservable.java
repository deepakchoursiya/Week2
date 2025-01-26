package day06.problem_statement.library_management_system;

// Interface Reservable
interface Reservable {
    boolean reserveItem(String borrower);
    boolean checkAvailability();
}
