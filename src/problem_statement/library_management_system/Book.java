package day06.problem_statement.library_management_system;

// Book class
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrower;

    // Constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public boolean reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            this.isAvailable = false;
            System.out.println("Book reserved by: " + borrower);
            return true;
        } else {
            System.out.println("Book is not available for reservation.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
