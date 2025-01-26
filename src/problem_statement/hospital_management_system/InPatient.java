package day06.problem_statement.hospital_management_system;

// InPatient class for patients who are admitted to the hospital
public class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private String medicalHistory;

    // Constructor
    public InPatient(int patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "";
    }

    // Implementing calculateBill method for InPatient
    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted; // Basic calculation for in-patient
    }

    // Implementing the MedicalRecord interface methods
    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
       // System.out.println();
    }

    @Override
    public void viewRecords() {
        System.out.println(medicalHistory);
    }
}
