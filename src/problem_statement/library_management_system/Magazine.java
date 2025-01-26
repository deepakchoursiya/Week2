package day06.problem_statement.library_management_system;

// Magazine class
class Magazine extends LibraryItem {
    // Constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }
}
