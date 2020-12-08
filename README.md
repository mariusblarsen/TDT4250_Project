# TDT4250 GanttProject

This project contains an xtext DSL that aims to be an intuitive textual way of generating Gantt chart by limiting scope, validation-warnings and appropriate suggestions. This is done by writing tasks and milestone with durations and dependencies, which result in an generated  XMI-file that can be used to import into GanttProject.

## Installation

### Dependency

GanttProject 2.8.11 (free), [Installation page](https://www.ganttproject.biz/download/free) *used to view the resulting file*

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
  * (Optional) Rename configuration, e.g "Gpx"
  * In tab "Plug-ins", select "Plug-ins selected below only" and uncheck:
    * tdt4250.ganttproject.xtext.tests (1.0.0 qualifier)
    * tdt4250.ganttproject.xtext.ui.tests (1.0.0 qualifier)
  * Leave rest as default and click "Run"
* Run "Gpx" in a new eclipse
* In the new Eclipse runtime, "File" -> "Import..."
* Choose the "General/Existing Projects into Workspace" wizard
* Click "Next"
* Check "Select root directory" and navigate to *\\{workspace name\} \tdt4250.ganttproject.xtext.examples
* Click "Select all" and then "Finish"
* When promped "Convert to xtext-project", select yes
  * If not prompted, rightclick project -> configure -> "Convert to xtext-project"
* You are now ready to test the DSL.

### Operating the UI

* Right-click sample.gpx
* *Open with gpx editor*
* Make changes as wanted
* The output XMI file *project.gan* can be found in src-gen found in the workspace
* Open *\{projectName\}.gan* in GanttProject to see the resulting file, or open it as text to view the raw file.
  * Unfortunatly, changes can't be seen in realtime as GanttProject does not refresh when new changes are made to the source-file.



