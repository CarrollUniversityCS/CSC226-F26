package medical_action_tracking;

public class TreatmentHistory {
    private LinkedStack<TreatmentRecord> allRecords;
    
    public TreatmentHistory() {
        allRecords = new LinkedStack<>();
    }
    
    public void addTreatment(String patientID, String treatment, String timestamp) {
        TreatmentRecord record = new TreatmentRecord(patientID, treatment, timestamp);
        allRecords.push(record);
    }
    
    //Undo the last action taken for a specific patient without compromising the structure of the stack
    public TreatmentRecord undoLastAction(String patientID) {
        return null;
    }
    
    public void displayPatientHistory(String patientID) {
        // Iterate and display only matching records given the PatientID
    }
}