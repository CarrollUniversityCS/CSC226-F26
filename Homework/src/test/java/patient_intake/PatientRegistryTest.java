package patient_intake;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PatientRegistryTest {
    
    private PatientRegistry registry;
    private Patient patient1;
    private Patient patient2;
    private Patient patient3;
    
    @BeforeEach
    void setUp() {
        registry = new PatientRegistry();
        
        // Create test patients using new constructor
        patient1 = new Patient(
            "P001", "John", "Doe", 45, "Chest pain", 3, "Waiting", "Room101", 14, "INS12345"
        );
        patient2 = new Patient(
            "P002", "Jane", "Smith", 32, "Headache", 2, "Waiting", "Room102", 10, "INS54321"
        );
        patient3 = new Patient(
            "P003", "Bob", "Johnson", 58, "Stomach pain", 4, "Waiting", "Room103", 16, "INS11111"
        );
    }
    
    @Test
    void testInitialRegistrySize() {
        assertEquals(0, registry.getPatientRegistry().length, "Initial registry should be empty");
    }
    
    @Test
    void testAddPatient() {
        registry.addPatient(patient1);
        assertEquals(1, registry.getPatientRegistry().length, "Registry should have 1 patient");
        assertEquals("P001", registry.getPatientRegistry()[0].getPatientID(), "Patient ID should match");
    }
    
    @Test
    void testAddMultiplePatients() {
        registry.addPatient(patient1);
        registry.addPatient(patient2);
        registry.addPatient(patient3);
        
        Patient[] patients = registry.getPatientRegistry();
        assertEquals(3, patients.length, "Registry should have 3 patients");
        assertEquals("P001", patients[0].getPatientID());
        assertEquals("P002", patients[1].getPatientID());
        assertEquals("P003", patients[2].getPatientID());
    }
    
    @Test
    void testGetPatientByIDFound() {
        registry.addPatient(patient1);
        registry.addPatient(patient2);
        
        Patient found = registry.getPatientByID("P001");
        assertNotNull(found, "Should find patient with valid ID");
        assertEquals("John", found.getFirstName());
        assertEquals("Doe", found.getLastName());
    }
    
    @Test
    void testGetPatientByIDNotFound() {
        registry.addPatient(patient1);
        
        Patient found = registry.getPatientByID("P999");
        assertNull(found, "Should return null for non-existent ID");
    }
    
    @Test
    void testGetPatientByIDEmptyRegistry() {
        Patient found = registry.getPatientByID("P001");
        assertNull(found, "Should return null when registry is empty");
    }
    
    @Test
    void testSetPatientRegistry() {
        Patient[] newRegistry = {patient1, patient2, patient3};
        registry.setPatientRegistry(newRegistry);
        
        Patient[] result = registry.getPatientRegistry();
        assertEquals(3, result.length, "Registry should have 3 patients after setting");
    }
    
    @Test
    void testSetPatientRegistryNull() {
        registry.addPatient(patient1);
        registry.setPatientRegistry(null);
        
        assertEquals(0, registry.getPatientRegistry().length, "Registry should be empty after setting null");
    }
    
    @Test
    void testRegistryCapacityExpansion() {
        // Add more than initial capacity (10) patients
        for (int i = 0; i < 15; i++) {
            Patient p = new Patient(
                "P" + String.format("%03d", i), "Patient", String.valueOf(i), 40, "Test", 3, "Waiting", "Room" + i, 12, "INS" + i
            );
            registry.addPatient(p);
        }
        
        assertEquals(15, registry.getPatientRegistry().length, "Registry should expand to hold 15 patients");
    }
    
    @Test
    void testPatientDataIntegrity() {
        registry.addPatient(patient1);
        registry.addPatient(patient2);
        
        Patient[] patients = registry.getPatientRegistry();
        
        // Verify all patient data is intact
        assertEquals("John", patients[0].getFirstName());
        assertEquals("Doe", patients[0].getLastName());
        assertEquals(45, patients[0].getAge());
        assertEquals("Chest pain", patients[0].getChiefComplaint());
        assertEquals(3, patients[0].getTriageLevel());
        
        assertEquals("Jane", patients[1].getFirstName());
        assertEquals("Smith", patients[1].getLastName());
        assertEquals(32, patients[1].getAge());
    }
    
    @Test
    void testGetPatientRegistryReturnsCopy() {
        registry.addPatient(patient1);
        
        Patient[] firstCopy = registry.getPatientRegistry();
        Patient[] secondCopy = registry.getPatientRegistry();
        
        // Verify they are different array instances
        assertNotSame(firstCopy, secondCopy, "Each call should return a new array copy");
        
        // Verify modifying one doesn't affect the registry
        firstCopy[0] = null;
        assertNotNull(registry.getPatientRegistry()[0], "Original registry should not be affected");
    }
    
    @Test
    void testToString() {
        registry.addPatient(patient1);
        String result = registry.toString();
        
        assertNotNull(result);
        assertTrue(result.contains("PatientRegistry"), "toString should contain class name");
        assertTrue(result.contains("size"), "toString should contain size info");
    }
}