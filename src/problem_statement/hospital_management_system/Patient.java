package day06.problem_statement.hospital_management_system;

// Abstract class Patient with fields for patient information and a billing method
public abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate the bill for the patient
    public abstract double calculateBill();

    // Concrete method to get patient details
    public void getPatientDetails() {

        System.out.println("Patient ID : " +patientId);
        System.out.println("Name: " +name);
        System.out.println("Age : " +age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
