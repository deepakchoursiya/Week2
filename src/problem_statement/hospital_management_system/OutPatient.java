package day06.problem_statement.hospital_management_system;

// OutPatient class for patients who visit for consultation
public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    // Constructor
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    // Implementing calculateBill method for OutPatient
    @Override
    public double calculateBill() {
        return consultationFee; // Only consultation fee for out-patient
    }

    // Implementing the MedicalRecord interface methods
    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println(medicalHistory);
    }
}
