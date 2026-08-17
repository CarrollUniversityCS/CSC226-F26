# CSC226 Hospital/ER Simulator - Semester Roadmap

## Overview

**Theme:** Build a complete Emergency Room simulation system for Carroll Memorial Hospital

**Pedagogical Approach:** Each week, add a new data structure module that integrates with the growing system

**Final Deliverable:** A working ER simulator demonstrating all major data structures from the course

---

## Week-by-Week Progression

### Week 1: Foundation - Patient Intake System
**Data Structures:** Arrays, Basic Classes  
**File I/O:** Scanner with TSV files

#### Scenario
You've been hired by Carroll Memorial Hospital to build their new electronic patient intake system. Your first task: create a basic patient registry.

#### Requirements
- **Patient Class** with fields: patientID, name, chiefComplaint, arrivalHour
- **PatientRegistry Class** with array-based storage
- **Main Program** to read patient data from TSV file and display registry

#### Skills Assessed
- Class design with encapsulation
- Array declaration and manipulation
- File I/O with Scanner
- Traditional for-loops
- toString() override

#### Deliverables
- `Patient.java` - Patient class with getters/setters
- `PatientRegistry.java` - Array-based patient storage
- `Main.java` - File reader and display program
- `patient_intake.tsv` - Sample patient data file

---

### Week 2: Big O Analysis - Triage Efficiency
**Focus:** Algorithm Analysis  
**Application:** Search strategy comparison

#### Scenario
The hospital needs to quickly find patient records during emergencies. Analyze different search strategies to determine the most efficient approach.

#### Requirements
- Implement linear search (O(n))
- Implement binary search (O(log n)) - requires sorted array
- Have students find their own (O(log n)) algorithm to implement
- Write analysis comparing approaches for emergency scenarios

#### Skills Assessed
- Big O notation understanding
- Search algorithm implementation
- Performance analysis
- Technical writing

#### Deliverables
- Search algorithm implementations
- Written analysis (1-2 pages)
- Timing comparison on sample data

---

### Week 3: Stack - Treatment History/Undo System
**Data Structure:** Linked Stack  
**Application:** Medical action tracking

#### Scenario
Doctors need to track all treatments administered to a patient and occasionally undo data entry errors. Implement a treatment history system.

#### Requirements
- **LinkedStack Class** - Custom stack implementation
- **TreatmentRecord Class** - Represents a single medical action
- **push()** - Add new treatment
- **pop()** - Undo last treatment
- **displayHistory()** - Show all treatments (LIFO order)

#### Skills Assessed
- Stack ADT implementation
- Linked node structure
- LIFO behavior
- Exception handling (empty stack)

#### Deliverables
- `LinkedStack.java` - Generic stack implementation
- `TreatmentRecord.java` - Treatment data class
- `TreatmentHistory.java` - Stack-based history tracker

---

### Week 4: Linked List - Patient Journey Timeline
**Data Structure:** Doubly Linked List  
**Application:** Track patient through hospital stages

#### Scenario
Patients move through multiple stages during their hospital visit. Track this journey with a linked list that supports insertion and deletion at any point.

#### Requirements
- **DoublyLinkedList Class** - Custom implementation
- **JourneyStage Enum** - Admission, Triage, Treatment, Recovery, Discharge
- **insertStage()** - Add stage at any position
- **removeStage()** - Patient transferred or discharged
- **displayJourney()** - Show complete timeline

#### Skills Assessed
- Doubly linked list implementation
- Node references (prev/next)
- Insertion/deletion at arbitrary positions
- List traversal

#### Deliverables
- `DoublyLinkedList.java` - Generic list implementation
- `PatientJourney.java` - Timeline tracker
- `JourneyStage.java` - Enum definition

---

### Week 5: Queue - Waiting Room Simulation ⭐
**Data Structure:** Array-Based Queue, Linked Queue  
**Application:** Patient waiting room management

#### Scenario
The urgent care waiting room operates on a first-come, first-served basis for non-critical patients. Implement a multi-queue waiting room system.

#### Requirements
- **Queue Interface** - Common operations (enqueue, dequeue, isEmpty)
- **ArrayBoundedQueue Class** - Fixed-size queue
- **LinkedQueue Class** - Dynamic queue
- **WaitingRoom Class** - Manages multiple queues (Pediatrics, General, Urgent)
- **addPatient()** - Enqueue patient to appropriate queue
- **callNextPatient()** - Dequeue for treatment
- **getWaitTime()** - Estimate based on queue length

#### Skills Assessed
- Queue ADT implementation
- FIFO behavior
- Multiple queue management
- Interface implementation

#### Deliverables
- `QueueInterface.java` - Common interface
- `ArrayBoundedQueue.java` - Array implementation
- `LinkedQueue.java` - Linked implementation
- `WaitingRoom.java` - Multi-queue manager

---

### Week 6: Collections - Standardize Data Access
**Data Structure:** ArrayCollection, LinkedCollection  
**Application:** Unified patient data access

#### Scenario
The hospital IT department wants a standard way to access patient data regardless of underlying storage. Create a collections framework.

#### Requirements
- **CollectionInterface** - Common operations (add, remove, find, display)
- **ArrayCollection Class** - Array-based collection
- **LinkedCollection Class** - Linked collection
- Compare performance characteristics

#### Skills Assessed
- Interface design
- Generic programming
- Collection ADT patterns
- Performance comparison

#### Deliverables
- `CollectionInterface.java` - Common interface
- `ArrayCollection.java` - Array implementation
- `LinkedCollection.java` - Linked implementation

---

### Week 7: EXAM WEEK
**No new assignment** - Catch up and prepare for midterm

---

### Week 8: Binary Search Tree - Patient Records Database ⭐
**Data Structure:** BST  
**Application:** Searchable electronic health records

#### Scenario
The hospital needs an efficient database for patient records. Implement a BST that supports fast lookup by patient ID and range queries for reporting.

#### Requirements
- **BSTNode Class** - Tree node with Patient data
- **BinarySearchTree Class** - BST implementation
- **insert()** - Add patient record
- **find()** - Lookup by patient ID
- **rangeQuery()** - Find all patients in ID range
- **inOrderTraversal()** - Get sorted patient list

#### Skills Assessed
- Tree structure understanding
- Recursive algorithms
- BST operations (insert, search, delete)
- Traversal methods

#### Deliverables
- `BSTNode.java` - Tree node class
- `BinarySearchTree.java` - BST implementation
- `PatientDatabase.java` - BST-based records system

---

### Week 9: HashMap - Staff/Patient Assignment
**Data Structure:** Hash Map  
**Application:** Fast lookup for hospital resources

#### Scenario
The hospital needs instant lookup for: which doctor is assigned to which patient, which room is occupied, staff schedules.

#### Requirements
- **MapInterface** - Common map operations
- **MapEntry Class** - Key-value pair
- **HashMap Class** - Hash table implementation
- Handle collisions (chaining or open addressing)
- Support resize/rehash

#### Skills Assessed
- Hash function design
- Collision handling
- Load factor management
- O(1) average-case operations

#### Deliverables
- `MapInterface.java` - Common interface
- `MapEntry.java` - Key-value class
- `HashMap.java` - Hash table implementation
- `HospitalRegistry.java` - Staff/patient/room lookup

---

### Week 10: Priority Queue - Emergency Triage System ⭐⭐
**Data Structure:** Heap-based Priority Queue  
**Application:** Critical patient prioritization

#### Scenario
**CORE HOSPITAL FEATURE:** The ER uses a triage system where critical patients are seen before less urgent cases, regardless of arrival time. Implement a priority queue that handles this.

#### Requirements
- **PriorityQueue Interface** - Common priority queue operations
- **HeapPriQ Class** - Heap-based implementation
- **PriorityLevel Enum** - CRITICAL(1), URGENT(2), STANDARD(3), MINOR(4)
- **enqueue()** - Add patient with priority
- **dequeue()** - Remove highest priority (lowest number) patient
- **preempt()** - New critical patient jumps queue

#### Skills Assessed
- Heap structure (complete binary tree)
- Heap operations (insert, remove, heapify)
- Priority-based ordering
- Preemption handling

#### Deliverables
- `PriorityQueueInterface.java` - Common interface
- `HeapPriQ.java` - Heap implementation
- `TriageSystem.java` - Priority-based patient management
- `PriorityLevel.java` - Enum definition

---

### Week 11: Graph - Hospital Layout & Patient Flow ⭐⭐
**Data Structure:** Weighted Graph  
**Application:** Physical hospital navigation

#### Scenario
The hospital needs to track patient movement between rooms and find optimal paths for transport. Model the hospital as a graph.

#### Requirements
- **WeightedGraph Interface** - Common graph operations
- **WeightedGraph Class** - Adjacency matrix or list implementation
- **GraphNode Class** - Represents rooms/locations
- **addEdge()** - Connect rooms with distance/travel time
- **findShortestPath()** - Dijkstra's algorithm or BFS
- **findNearest()** - Closest available room

#### Skills Assessed
- Graph representation (adjacency matrix/list)
- Graph traversal (BFS, DFS)
- Shortest path algorithms
- Real-world modeling

#### Deliverables
- `WeightedGraphInterface.java` - Common interface
- `WeightedGraph.java` - Graph implementation
- `HospitalMap.java` - Physical layout model
- `Room.java` - Location node class

---

### Week 12: Sorting - Analytics Dashboard
**Data Structures:** Multiple sorting algorithms  
**Application:** Hospital performance metrics

#### Scenario
Hospital administration needs reports sorted by various criteria: wait times, patient volume, staff utilization. Implement and compare sorting algorithms.

#### Requirements
- **Selection Sort** - O(n²) baseline
- **Insertion Sort** - O(n²) for nearly-sorted data
- **Bubble Sort** - Educational comparison
- **Merge Sort** - O(n log n) efficient sorting
- **Quick Sort** - O(n log n) average case
- Compare performance on realistic datasets

#### Skills Assessed
- Sorting algorithm implementation
- Time complexity comparison
- Stability considerations
- Algorithm selection criteria

#### Deliverables
- All five sorting implementations
- Performance comparison report
- Analytics dashboard using best algorithm

---

### Week 13: Final Project - Full ER Simulation Integration ⭐⭐⭐
**Application:** Complete system demonstration

#### Scenario
**CAPSTONE:** Integrate all modules into a working ER simulation that demonstrates the complete patient journey from arrival to discharge.

#### Requirements
1. **Patient arrives** → Queue (waiting room)
2. **Triage nurse assigns priority** → Priority Queue
3. **Critical patient jumps queue** → Preemption
4. **Doctor assigned** → HashMap lookup
5. **Treatment recorded** → Stack history
6. **Patient moved through rooms** → Graph navigation
7. **Journey tracked** → Linked List timeline
8. **Records stored** → BST database
9. **Analytics generated** → Sorting algorithms

#### Deliverables
- **Complete ER Simulator** with all modules integrated
- **Demo Program** showing full patient journey
- **Final Report** (5-10 pages) explaining:
  - System architecture
  - Data structure choices
  - Performance analysis
  - Lessons learned
- **Presentation** (10-15 minutes) demonstrating the system

---

## Assessment Overview

| Component | Weight | Description |
|-----------|--------|-------------|
| Weekly Assignments | 50% | Individual module implementations |
| Midterm Exam | 10% | Weeks 1-6 concepts |
| Final Exam | 15% | Comprehensive, emphasis on Weeks 8-12 |
| Final Project | 20% | Integrated system + report + presentation |
| Participation | 5% | Code reviews, discussions, office hours |

---

## Repository Structure & Distribution

### Folder Naming Convention

Each week's assignment uses a **descriptive project name** with numeric prefix for sorting:

```
Homework/
└── HospitalSimulator/
    ├── 01_patient_intake/          ← Week 1: Arrays, Classes, File I/O
    ├── 02_triage_analysis/         ← Week 2: Big O, Search Algorithms
    ├── 03_treatment_stack/         ← Week 3: Stack ADT, LIFO
    ├── 04_patient_journey/         ← Week 4: Linked List, Timeline
    ├── 05_waiting_room/            ← Week 5: Queue ADT, FIFO
    ├── 06_collections/             ← Week 6: Collection Interface
    ├── 07_exam_week/               ← Week 7: No Assignment (Midterm)
    ├── 08_patient_database/        ← Week 8: Binary Search Tree
    ├── 09_staff_registry/          ← Week 9: HashMap, Hash Table
    ├── 10_emergency_triage/        ← Week 10: Priority Queue, Heap
    ├── 11_hospital_map/            ← Week 11: Graph, Pathfinding
    ├── 12_analytics_dashboard/     ← Week 12: Sorting Algorithms
    └── 13_final_integration/       ← Week 13: Capstone Project
```


### Distribution Workflow

**Instructor Repository:** `CarrollUniversityCS/CSC226` (or your personal fork)

1. **Before Semester:** Create `Homework/HospitalSimulator/` with all folder stubs
2. **Each Monday:** Push that week's files directly to the folder (e.g., `01_patient_intake/Patient.java`)
3. **Students:** Fork the main repo at semester start
4. **Students:** `git pull upstream main` each week to get new assignments
5. **Submission:** Students push completed work to their forks, submit link via Canvas

### Why This Works

| Benefit | Explanation |
|---------|-------------|
| **No Merge Conflicts** | Each week is a new folder; instructor never modifies released code |
| **Descriptive Names** | Students know the topic at a glance |
| **Numeric Prefix** | Folders sort correctly in file explorers |
| **Flexible Pacing** | If you skip a week or adjust, names still make sense |
| **Clean Structure** | Files live directly in week folders—no nested "starter" directories |

### Example Folder Structure

```
01_patient_intake/
├── Patient.java              ← Student completes this
├── PatientRegistry.java      ← Student completes this
├── Main.java                 ← Student completes this
├── patient_intake.tsv        ← Sample data file
└── PatientTest.java          ← JUnit test file
```

