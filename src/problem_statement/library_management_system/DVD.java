package day06.problem_statement.library_management_system;

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrower;

    // Constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs can be loaned for 5 days
    }

    @Override
    public boolean reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            this.isAvailable = false;
            System.out.println("DVD reserved by: " + borrower);
            return true;
        } else {
            System.out.println("DVD is not available for reservation.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
