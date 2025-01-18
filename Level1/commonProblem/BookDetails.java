class BookDetails {
    String title;
    String author;
    double price;

    // Default Constructor
    BookDetails() {
        this.title = "Placement Series by DKC";
        this.author = "Deepak kumar choursiya";
        this.price = 1000.0;
    }

    // Parameterized Constructor
    BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {

        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        BookDetails defaultBook = new BookDetails();
        BookDetails parameterizedBook = new BookDetails("Java Basic", "DKC", 500.0);

        defaultBook.displayDetails();
        parameterizedBook.displayDetails();
    }
}
