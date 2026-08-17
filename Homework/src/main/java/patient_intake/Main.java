package patient_intake;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
   public Main() {
   }
   public static void main(String[] args) {
      try {
         Scanner input_reader = new Scanner(new File("src/main/java/patient_intake/patients.csv"));
         PatientRegistry patients = new PatientRegistry();
         input_reader.nextLine(); // Skip header
         while(input_reader.hasNextLine()) {
            String[] parts = input_reader.nextLine().split(",");
            String[] nameParts = parts[1].split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts.length > 1 ? nameParts[1] : "";
            int age = Integer.parseInt(parts[2]);
            String chiefComplaint = parts[3];
            int triageLevel = Integer.parseInt(parts[4]);
            String currentStage = parts[5];
            String assignedRoom = parts[6];
            int arrivalHour = Integer.parseInt(parts[7]);
            String insuranceID = parts[8];
            
            Patient tmp = new Patient(parts[0], firstName, lastName, age, 
                                      chiefComplaint, triageLevel, currentStage, 
                                      assignedRoom, arrivalHour, insuranceID);
            patients.addPatient(tmp);
         }
         System.out.println(patients.toString());
         input_reader.close();
      } catch (FileNotFoundException var4) {
         System.out.println("File not found: " + var4.getMessage());
      }
   }
}