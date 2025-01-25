package day06.problem_statement.employee_management_system;

// Subclass FullTimeEmployee implementing salary calculation and Department interface
public class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String departmentName;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Implement calculateSalary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
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
