# TDT4250 GanttProject

## TODO

- [x] Derived feature slaveTasks
- [x] \<depend\> in generateTask
- [ ] Start date for tasks with dependencies
- [ ] (?) Start-view for project: Earliest date of all tasks. Could be a derived feature of project

## Installation

### Cloning

* Clone repo
* Setup an Eclipse workspace
* Import cloned project into workspace

### Plug-in project

* Create new plug-in project
* **Project name**: tdt4250.ganttproject.xtext.examples
* *"Next"*
* **Execution environment**: JavaSE-11
* *"Finish"*
* Copy sample.gpx into project
  * Found in /tdt4250.ganttproject.xtext.tests/src/tdt4250/ganttproject/tests/sample.gpx

### Run IDE

* Create new run configuration
  * (Optional) Rename configuration, e.g "gpx-ide"
  * In tab "Plug-ins", select "Plug-ins selected below only" and uncheck:
    * tdt4250.ganttproject.xtext.tests (1.0.0 qualifier)
    * tdt4250.ganttproject.xtext.ui.tests (1.0.0 qualifier)
  * Leave rest as default and click "Run"
* Run "gpx-ide" in a new eclipse
* In the new Eclipse runtime, "File" -> "Import..."
* Choose the "General/Existing Projects into Workspace" wizard
* Click "Next"
* Check "Select root directory" and navigate to *\\{workspace name\} \tdt4250.ganttproject.xtext.examples
* Click "Select all" and then "Finish"
* When promped "Convert to xtext-project", select yes
  * If not prompted, rightclick project -> configure -> "Convert to xtext-project"
* You are now ready to test the DSL IDE.



