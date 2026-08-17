package triage_efficiency;
import patient_intake.*;

public class Main {
    public static void main(String[] args){
        Patient[] patients = generatePatients(50);
        PatientRegistry registry = new PatientRegistry();
        for(int i=0;i<patients.length;i++){
            registry.addPatient(patients[i]);
        }
        EfficiencyTester exampleVariableName = new EfficiencyTester();
        exampleVariableName.timeDemo();
    }

    // This function generates X number of patients 
    public static Patient[] generatePatients(int count) {
        String[] complaints = {"Chest Pain", "Headache", "Abdominal Pain", "Shortness of Breath", 
                            "Fractured Arm", "Allergic Reaction", "Nausea", "Dizziness", 
                            "Back Pain", "Cut on Hand"};
        String[] stages = {"Admission", "Triage", "Treatment", "Recovery", "Waiting"};
        String[] firstNames = {"John", "Mary", "Robert", "Patricia", "Michael", "Linda", 
                            "James", "Elizabeth", "David", "Barbara"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Davis", "Miller", 
                            "Wilson", "Moore", "Taylor", "Anderson"};
        
        Patient[] patients = new Patient[count];
        for (int i = 0; i < count; i++) {
            String patientID = "P" + String.format("%05d", i);
            String firstName = firstNames[i % 10];
            String lastName = lastNames[i % 10] + " " + i;
            int age = 20 + (i % 60);
            String chiefComplaint = complaints[i % 10];
            int triageLevel = (i % 4) + 1;
            String currentStage = stages[i % 5];
            String assignedRoom = "ER-" + String.format("%03d", i % 100);
            int arrivalHour = 8 + (i % 112);
            String insuranceID = "INS-" + String.format("%05d", i);
            
            patients[i] = new Patient(patientID, firstName, lastName, age,
                                      chiefComplaint, triageLevel, currentStage,
                                      assignedRoom, arrivalHour, insuranceID);
        }
        return patients;
    }

}