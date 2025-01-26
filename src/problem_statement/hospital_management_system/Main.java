package day06.problem_statement.hospital_management_system;
// Main class to test the Hospital Patient Management System
public class Main{
    public static void main(String[] args) {
        // Creating an InPatient and an OutPatient
        InPatient inPatient = new InPatient(1, "Abhay", 45, 1000, 5);
        inPatient.addRecord("Admitted with severe chest pain.");
        inPatient.addRecord("Diagnosed with pneumonia.");

        OutPatient outPatient = new OutPatient(2, "BabuBhai", 30, 200);
        outPatient.addRecord("Visited for routine checkup.");

        // Processing the patients
        HospitalManagement.processPatient(inPatient);
        HospitalManagement.processPatient(outPatient);
    }
}
