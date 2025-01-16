class Book
{	
	//  data members
	private String title;
	private String author;
	private int price;
	
	//constructor for object initiaization
	Book( String title , String author , int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	// method for display details
	void displayBookDetails()
	{
	  System.out.println(" Title : " + title);
	  System.out.println(" Author : " + author);
	  System.out.println(" Price : " + price);

	}
	
}
class Books
{
	public static void main(String args[])
	{
	     // object creation of book class   
		Book book1 = new Book("Ikigai" , "Deepak" , 100);
		Book book2 = new Book("ReWork" , "choursiya" , 100);
		
		book1.displayBookDetails();
		book2.displayBookDetails();
	}
	
}
