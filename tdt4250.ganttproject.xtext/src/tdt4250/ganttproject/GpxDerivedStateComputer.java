package tdt4250.ganttproject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import tdt4250.ganttproject.gpx.AbstractTask;
import tdt4250.ganttproject.gpx.Project;
import tdt4250.ganttproject.gpx.Task;

public class GpxDerivedStateComputer implements IDerivedStateComputer {

	private int counter = 1;
	
	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		EObject root = resource.getContents().get(0);
		 if (root instanceof Project) {
			Project project = (Project) root;
			EList<AbstractTask> tasks = project.getTasks();
			if (!tasks.isEmpty()) {
				initializeTasks(project.getTasks(), false);
				deriveSlaveTasks(project.getTasks());
			}
		 }
	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		EList<EObject> result = resource.getContents();
		if (result instanceof Project) {
			Project project = (Project) result;
			EList<AbstractTask> tasks = project.getTasks();
			if (!tasks.isEmpty()) {
				initializeTasks(project.getTasks(), true);
				deriveSlaveTasks(project.getTasks());
			}
		}
	}
	
	private void initializeTasks(EList<AbstractTask> tasks, boolean discardState) {
		for (AbstractTask t : tasks) {
			t.setId(discardState? null : counter++);
			if (t instanceof Task) {
				EList<AbstractTask> subtasks = ((Task) t).getSubtasks();
				if (!subtasks.isEmpty()) {
					initializeTasks(subtasks, false);
				}
			}
		}
	}
	
	public void deriveSlaveTasks(EList<AbstractTask> tasks) {
		for (AbstractTask t : tasks) {
			// Add slavetasks for given task
			if (t.getDependency() != null) {
				for (AbstractTask master : t.getDependency().getDependees()) {
					master.addSlaveTasks(t);
				}
			// Then recursively do it for subtasks
			if (t instanceof Task) {
				EList<AbstractTask> subtasks = ((Task) t).getSubtasks();
				if (!subtasks.isEmpty()) {
					deriveSlaveTasks(subtasks);
				}
			}
			}
		}
	}
}
