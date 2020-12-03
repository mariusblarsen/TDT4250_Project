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
		 EObject root = resource.getContents().get(0);
		 if (root instanceof Project) {
			Project project = (Project) root;
			initializeTasks(project.getTasks(), false);
		 }
	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		EList<EObject> result = resource.getContents();
		if (result instanceof Project) {
			Project project = (Project) result;
			initializeTasks(project.getTasks(), true);
		}
	}
	
	private void initializeTasks(EList<AbstractTask> tasks, boolean discardState) {
		for (AbstractTask t : tasks) {
			t.setId(discardState? null : counter++);
			if (t instanceof Task) {
				initializeTasks(((Task) t).getSubtasks(), discardState);
			}
		}
	}

}
