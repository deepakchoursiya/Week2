class Item
{
     //data members
	 private int itemCode;
	 private String itemName;
	 private int price;
	 
	 // constructor for initiallzing data members
	 
	 Item(int itemCode , String itemName , int price)
	 {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	 }
	 
	 // methods for displaying item details
	 
	 void displayItem()
	 {
		System.out.println("Itemcode  : " + itemCode);
		System.out.println("Itemname  : " + itemName);
		System.out.println("Itemprice : " + price);
	 }
}
class Items
{
	public static void main(String args[])
	{  
		// creating objects for items
		Item i1 = new Item(100 , "Apple" , 150);
		Item i2 = new Item(101 , "Banana" , 60);
		
		// calling display function of item
		i1.displayItem();
		i2.displayItem();
		 
	}
}