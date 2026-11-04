package medical_action_tracking;

public class TreatmentRecord {
    private String patientID;
    private String treatmentName;
    private String timestamp;
    private String performedBy;

    public TreatmentRecord(String patientID, String treatmentName, String timestamp) {
        this(patientID, treatmentName, timestamp, null);
    }

    public TreatmentRecord(String patientID, String treatmentName, String timestamp, String performedBy) {
        this.patientID = patientID;
        this.treatmentName = treatmentName;
        this.timestamp = timestamp;
        this.performedBy = performedBy;
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

    public String getPerformedBy() {
        return performedBy;
    }

    @Override
    public String toString() {
        //  Return "timestamp | patientID | treatmentName".
        return timestamp + " | " + patientID + " | " + treatmentName;
    }
}
