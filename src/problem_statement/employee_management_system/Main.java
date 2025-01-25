package day06.problem_statement.employee_management_system;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee and PartTimeEmployee to the list
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Aayush", 30000, 15000);
        fullTimeEmployee.assignDepartment("HR");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Virat", 20000, 40, 200);
        partTimeEmployee.assignDepartment("IT");

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Process and display details for all employees
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            System.out.println("-----------------------------------");
        }
    }
}

