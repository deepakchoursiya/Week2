 class Circle
 {
	 // data members 
	private int radius;
	
	// initiallizing radius through constructor
	Circle(int radius)
	{	
		this.radius = radius;
	}
	
	// area calculation
	void areaOfCircle()
	{
	    float area = 3.14f * radius * radius;
		System.out.println( " Area of circle : " + area);
	}
	
	// circumFerence calculation
	void circumferenceOfCircle()
	{
		float circumFerence = 2 * 3.14f * radius ;
		System.out.println(" Circumference of circle : " + circumFerence);
	}
	
 }
 
 class Circles
 {
	public static void main(String args[])
	{
		// object creation of ircle class
	  Circle circle1 = new Circle(10);
	  Circle circle2 = new Circle(7);
	  
	  // method calling of circle class
	  circle1.areaOfCircle();
	  circle2.circumferenceOfCircle();
	}
 }