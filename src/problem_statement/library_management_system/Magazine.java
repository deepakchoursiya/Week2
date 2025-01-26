package day06.problem_statement.library_management_system;

// Magazine class
class Magazine extends LibraryItem implements Reservable{
    private boolean isAvailable;
    private String borrower;

    // Constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    public boolean reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            this.isAvailable = false;
            System.out.println("Magazine reserved by: " + borrower);
            return true;
        } else {
            System.out.println("Magazine  is not available for reservation.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

}
