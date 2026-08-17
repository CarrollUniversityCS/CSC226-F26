package medical_action_tracking;

public class TreatmentRecord {
    private String patientID;
    private String treatmentName;
    private String timestamp;
 
    public TreatmentRecord(String patientID, String treatment, String timestamp){
        this.patientID=patientID;
        this.treatmentName=treatment;
        this.timestamp=timestamp;
    }
}
