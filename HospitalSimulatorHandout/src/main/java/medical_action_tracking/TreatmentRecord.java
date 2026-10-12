package medical_action_tracking;

public class TreatmentRecord {
    private String patientID;
    private String treatmentName;
    private String timestamp;

    public TreatmentRecord(String patientID, String treatmentName, String timestamp) {
        this.patientID = patientID;
        this.treatmentName = treatmentName;
        this.timestamp = timestamp;
    }

    public String getPatientID() {
        //  Return the patient ID.
        return patientID;
    }

    public String getTreatmentName() {
        //  Return the treatment description.
        return treatmentName;
    }

    public String getTimestamp() {
        //  Return the timestamp.
        return timestamp;
    }

    @Override
    public String toString() {
        //  Return "timestamp | patientID | treatmentName".
        return timestamp + " | " + patientID + " | " + treatmentName;
    }
}
