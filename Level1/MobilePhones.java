class MobilePhone
{
	// data members declaration
	private String brand;
	private String model;
	private int price;
	
	// constructor for initializing 
	MobilePhone(String brand , String model , int price)
	{
		this.brand = brand;
		this.model =model;
		this.price = price;
	}
	
	// methods for displaying detils of mobiles 
	
	void displayMobileDetails()
	{
		System.out.println("Mobile brand : " + brand);
		System.out.println("Mobile model : " + model);
		System.out.println("Mobile price : " + price);
	}  

}
class MobilePhones
{
	public static void main(String args[])
	{
		// creating  objects
		MobilePhone m1 = new MobilePhone("Apple" , "I15" , 120000);
		MobilePhone m2 = new MobilePhone("Apple" , "I16" , 150000);
		
		//calling methods of mobile class
		m1.displayMobileDetails();
		m2.displayMobileDetails();
		
	}
}