# CSC226 Hospital/ER Simulator - Witty Title Here

---

## Week 2: Triage Efficiency

Your second deliverable is the **Triage** module. This component must accomplish the following tasks:

| # | Task | Details |
|---|------|---------|
| 1 | **Implement Linear Search** | Complete function outline found in `EfficiencyTester.java` |
| 2 | **Implement Binary Search** | Complete function outline found in `EfficiencyTester.java` |
| 3 | **Implement an algorithm of your choice** | Complete function outline found in `EfficiencyTester.java` |
| 4 | **Test** | Test all three algorithms in `Main.java` populated with fake data using `generatePatients()` |
| 5 | **JUnit** | Create JUnit tests for all the functions you created in `EfficiencyTester.java` |
| 6 | **Timing Comparison** | Create a document that shows a timing comparison on sample data, see below for added detail |


### Timing Comparison

Create a word document that compares the following:

Run your search algorithms on datasets of different sizes. Record your findings in a table like this:

| Dataset Size | Linear Search Time | Binary Search Time | Your O(log n) Algorithm Time |
|--------------|-------------------|-------------------|-----------------------------|
| 100 patients | ___ ns | ___ ns | ___ ns |
| 1,000 patients | ___ ns | ___ ns | ___ ns |
| 10,000 patients | ___ ns | ___ ns | ___ ns |
| 100,000 patients | ___ ns | ___ ns | ___ ns |

Answer the following questions in your report: 
1. As the dataset grows by 10x each time, how does each algorithm's time change on average?
2. Carroll Memorial Hospital sees about 50,000 patients per year. Which search algorithm would you recommend for their system? Why?
3. Is measuring Time Efficiency in this way the best way to assess algorithmic efficiency? 

The final submission must contain several things:
1. All TODO's outline in comments must be complete
2. All tests must run without errors(including the new ones you make....)
3. A Word document, PDF, or markdown file answering question 6