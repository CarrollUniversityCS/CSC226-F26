# CSC226 Hospital/ER Simulator - Witty Title Here

---

## Week 3: Treatment History (Stack Implementation)

Your third deliverable is the **Treatment History** module. This component uses a stack data structure to track medical actions administered to patients and support undoing data entry errors.

### Scenario

Doctors need to track all treatments administered to a patient and occasionally undo data entry errors. Implement a treatment history system using a custom stack.

---

## Requirements

| # | Task | Details |
|---|------|---------|
| 1 | **Implement LinkedStack** | Create a generic stack using linked nodes (`LinkedStack.java`) |
| 2 | **Create TreatmentRecord** | Define the data structure for a single treatment (`TreatmentRecord.java`) |
| 3 | **Build TreatmentHistory** | Use your stack to track treatments (`TreatmentHistory.java`) |
| 4 | **Implement Core Operations** | `push()` (add treatment), `pop()` (undo last), `displayHistory()` (show all) |
| 5 | **Test** | Demonstrate your stack in `Main.java` with sample patient data |
| 6 | **JUnit Tests** | Create comprehensive tests for all three classes |

---

## Technical Specifications

### LinkedStack<T>
- Must use a **linked list** implementation (NOT Java's built-in Stack or LinkedList)
- Must be **generic** (work with any data type)
- Required methods:
  - `push(T item)` - Add element to top
  - `pop()` - Remove and return top element
  - `peek()` - Return top element without removing
  - `isEmpty()` - Check if stack is empty
  - `size()` - Return number of elements

### TreatmentRecord
- Must contain:
  - `patientID` (String) - Links record to a specific patient
  - `treatment` (String) - Description of medical action
  - `timestamp` (String) - When treatment occurred (format: "YYYY-MM-DD HH:MM")
- Include appropriate getters/setters and constructor

### TreatmentHistory
- Uses `LinkedStack<TreatmentRecord>` internally
- Required methods:
  - `addTreatment(String patientID, String treatmentName, String timestamp)` - Push new record
  - `undoLastAction(String patientID)` - Remove most recent treatment for a patient
  - `displayHistory(String patientID)` - Print all treatments for a patient (LIFO order)

---

## Deliverables

Submit the following files:

1. `LinkedStack.java` - Your generic linked stack implementation
2. `TreatmentRecord.java` - Treatment data class
3. `TreatmentHistory.java` - Stack-based history tracker
4. `Main.java` - Demo program showing your stack in action
5. `tests/medical_action_tracking/LinkedStackTest.java` - JUnit tests for stack
6. `tests/medical_action_tracking/TreatmentRecordTest.java` - JUnit tests for record
7. `tests/medical_action_tracking/TreatmentHistoryTest.java` - JUnit tests for history

---

### Success Criteria
- All stack operations work correctly (push, pop, peek, isEmpty, size)
- LIFO ordering is maintained
- Undo functionality correctly removes the most recent treatment
- All JUnit tests pass
- Code is well-commented and follows Java conventions

