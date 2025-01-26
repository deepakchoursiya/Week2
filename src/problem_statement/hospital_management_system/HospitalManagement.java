package day06.problem_statement.hospital_management_system;

// HospitalManagement class to handle patient billing and record management
public class HospitalManagement {

    // Method to process the patient and calculate the bill
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill());
        if (patient instanceof MedicalRecord) {
            MedicalRecord medicalRecordPatient = (MedicalRecord) patient;
          //  System.out.println("Medical Records: \n" + medicalRecordPatient.viewRecords());
            medicalRecordPatient.viewRecords();
        }
    }
}
