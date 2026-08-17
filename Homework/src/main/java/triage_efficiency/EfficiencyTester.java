package triage_efficiency;
import java.util.*;

import patient_intake.Patient;

public class EfficiencyTester {
    
    /**
     * TODO: Implement Linear Search - O(n) Complexity
     * 
     * Your Task:
     * Implement a linear search algorithm that searches through the patient array
     * sequentially until it finds a patient with the matching patientID.
     * 
     * Requirements:
     * - Search through ALL patients in the array (no shortcuts!)
     * - Return the Patient object if found, null if not found
     * - Your implementation MUST be O(n) time complexity
     * 
     * 
     * @param patients Array of Patient objects to search through
     * @param pid The patientID to search for (e.g., "P00523")
     * @return The Patient object if found, null if not found
     */
    public Patient linearSearch(Patient[] patients, String pid) {
        // TODO: Implement linear search algorithm
        return null; // Remove this line and implement
    }
    
    /**
     * TODO: Implement Binary Search - O(log n) Complexity
     * 
     * Your Task:
     * Implement a binary search algorithm that searches through a SORTED
     * patient array by repeatedly dividing the search interval in half.
     * 
     * IMPORTANT: This algorithm ONLY works on SORTED arrays!
     * The patients array must be sorted by patientID before calling this method.
     * 
     * - Return the Patient object if found, null if not found
     * - Your implementation MUST be O(log n) time complexity
     * 
     * 
     * @param patients SORTED array of Patient objects (sorted by patientID)
     * @param pid The patientID to search for (e.g., "P00523")
     * @return The Patient object if found, null if not found
     */
    public Patient binarySearch(Patient[] patients, String pid) {
        // TODO: Implement binary search algorithm (ITERATIVE ONLY)
        return null; // Remove this line and implement
    }
    
    /**
     * TODO: Research & Implement an O(log n) Search Algorithm
     * 
     * Your Task:
     * 1. RESEARCH: Find an O(log n) search algorithm different from binary search.
     *    Good options to investigate:
     *    - Exponential Search (find range, then binary search)
     *    - Ternary Search (divide into 3 parts instead of 2)
     *    - Jump Search (jump ahead by fixed steps, then linear search)
     *    - Interpolation Search (estimate position based on value distribution)
     * 
     * 2. IMPLEMENT: Code your chosen algorithm in the method below.
     * 
     * 3. DOCUMENT: Add a comment above your implementation stating:
     *    - Which algorithm you chose
     *    - A URL or citation for where you learned about it
     *    - Brief explanation of how it works
     * 
     * Requirements:
     * - Must be O(log n) or better time complexity
     * - Must work on sorted arrays
     * - Return the Patient object if found, null if not found
     * 
     * @param patients SORTED array of Patient objects (sorted by patientID)
     * @param pid The patientID to search for (e.g., "P00523")
     * @return The Patient object if found, null if not found
     */
    public Patient logNSearch(Patient[] patients, String pid) {
        // TODO: Research and implement an O(log n) search algorithm
        // TODO: Add comment citing your source and explaining your choice
        return null; // Remove this line and implement
    }

    public void timeDemo(){
        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++){
            int x = 5+5;
        }
        long endTime = System.nanoTime();
        
        // NanoSeconds is great for this example, consider how we might convert to seconds.
        System.out.println("The example addition took: " + (endTime - startTime) + " ns");
       
        startTime = System.nanoTime();
        for(int i=0;i<100000;i++){
            int x = 5*5;
        }
        endTime = System.nanoTime();
        System.out.println("The example multiplication took: " + (endTime - startTime) + " ns");
    }
}