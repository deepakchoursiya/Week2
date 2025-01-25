package day06.problem_statement.employee_management_system;


// Subclass PartTimeEmployee implementing salary calculation and Department interface
public class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String departmentName;

    // Constructor
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    // Implement calculateSalary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    // Implement assignDepartment
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Implement getDepartmentDetails
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }


    public void displayDetails() {

        super.displayDetails();
        System.out.println("Department: " + getDepartmentDetails());

    }

}
