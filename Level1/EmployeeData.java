public class EmployeeData
{
	// attributes of employee
	
	private String employeeName;
	private int employeeId;
	private int employeeSalary;
	
	// constructor for initializing data members
	EmployeeData(String employeeName , int employeeId ,  int employeeSalary)
	{	
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	
	// method for displaying employee details
	void employeeDetails()
	{
	   System.out.println(" Employee name : " + employeeName);
	   System.out.println(" Employee id : " + employeeId);
	   System.out.println(" Employee salary : " + employeeSalary);
	   	
	}


	public static void main(String arg[])
	{
	    // object creation of employee class
		EmployeeData employeeDetail1 = new EmployeeData( "Alice" , 100 , 25000);
		
		EmployeeData employeeDetail2 = new EmployeeData( "Bob" , 101 , 28000);
		
		System.out.println(" Employee Data ");
		
		employeeDetail1.employeeDetails();
		employeeDetail2.employeeDetails();
		
	}
}