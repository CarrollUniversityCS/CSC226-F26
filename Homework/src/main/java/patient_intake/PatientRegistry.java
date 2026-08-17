package patient_intake;
// Switch from using ArrayList to a flat array implementation for patient storage.

public class PatientRegistry {
    // Flat array to store patients and a size field to track the number of stored patients.
    private Patient[] patientRegistry;
    private int size; // track actual number of patients

    // Initial capacity for the flat array. Can be adjusted as needed.
    private static final int INITIAL_CAPACITY = 10;

    public PatientRegistry() {
        this.patientRegistry = new Patient[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void addPatient(Patient patient) {
        // Ensure capacity before adding a new patient.
        if (size >= patientRegistry.length) {
            // Resize array: double the capacity.
            int newCapacity = patientRegistry.length * 2;
            Patient[] newArray = new Patient[newCapacity];
            System.arraycopy(patientRegistry, 0, newArray, 0, patientRegistry.length);
            patientRegistry = newArray;
        }
        patientRegistry[size++] = patient;
    }

    /**
     * Returns a copy of the internal patient array trimmed to the current size.
     * This preserves encapsulation while still providing array semantics.
     */
    public Patient[] getPatientRegistry() {
        Patient[] copy = new Patient[size];
        System.arraycopy(patientRegistry, 0, copy, 0, size);
        return copy;
    }

    /**
     * Replaces the internal registry with the provided array.
     * The size field is set to the length of the provided array.
     */
    public void setPatientRegistry(Patient[] patientRegistry) {
        if (patientRegistry == null) {
            this.patientRegistry = new Patient[INITIAL_CAPACITY];
            this.size = 0;
        } else {
            this.patientRegistry = patientRegistry;
            this.size = patientRegistry.length;
        }
    }

    public Patient getPatientByID(String patientID) {
        for (int i = 0; i < size; i++) {
            Patient patient = patientRegistry[i];
            if (patient != null && patient.getPatientID().equals(patientID)) {
                return patient;
            }
        }
        return null; // Return null if no patient with the given ID is found
    }

    /**
     * Removes a patient from the registry by patientID.
     * @param patientID The ID of the patient to remove
     * @return true if patient was found and removed, false otherwise
     */
    public boolean removePatient(String patientID) {
        for (int i = 0; i < size; i++) {
            if (patientRegistry[i] != null && patientRegistry[i].getPatientID().equals(patientID)) {
                removePatient(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Removes a patient from the registry by index.
     * @param index The index of the patient to remove
     * @return the removed Patient, or null if index is invalid
     */
    public Patient removePatient(int index) {
        if (index < 0 || index >= size) {
            return null; // Invalid index
        }
        Patient removed = patientRegistry[index];
        // Shift all elements after index one position to the left
        for (int i = index; i < size - 1; i++) {
            patientRegistry[i] = patientRegistry[i + 1];
        }
        patientRegistry[size - 1] = null;
        size--;
        return removed;
    }

    /**
     * Updates a patient in the registry by matching patientID.
     * @param updatedPatient The patient with updated information
     * @return true if patient was found and updated, false otherwise
     */
    public boolean updatePatient(Patient updatedPatient) {
        for (int i = 0; i < size; i++) {
            if (patientRegistry[i] != null && patientRegistry[i].getPatientID().equals(updatedPatient.getPatientID())) {
                patientRegistry[i] = updatedPatient;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        // Provide a meaningful representation of the registry, e.g.:
        return "PatientRegistry{size=" + size + ", patients=" + java.util.Arrays.toString(getPatientRegistry()) + "}";
    }

}


