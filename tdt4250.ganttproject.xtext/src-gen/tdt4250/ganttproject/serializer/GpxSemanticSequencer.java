/*
 * generated by Xtext 2.23.0
 */
package tdt4250.ganttproject.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import tdt4250.ganttproject.gpx.Dependency;
import tdt4250.ganttproject.gpx.GpxPackage;
import tdt4250.ganttproject.gpx.Milestone;
import tdt4250.ganttproject.gpx.Project;
import tdt4250.ganttproject.gpx.Task;
import tdt4250.ganttproject.services.GpxGrammarAccess;

@SuppressWarnings("all")
public class GpxSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GpxGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GpxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GpxPackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case GpxPackage.MILESTONE:
				sequence_Milestone(context, (Milestone) semanticObject); 
				return; 
			case GpxPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case GpxPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     (master+=[AbstractTask|STRING] master+=[AbstractTask|STRING]*)
	 */
	protected void sequence_Dependency(ISerializationContext context, Dependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTask returns Milestone
	 *     Milestone returns Milestone
	 *
	 * Constraint:
	 *     (name=STRING endDate=Date dependency=Dependency?)
	 */
	protected void sequence_Milestone(ISerializationContext context, Milestone semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Project returns Project
	 *
	 * Constraint:
	 *     (name=STRING (tasks+=AbstractTask tasks+=AbstractTask*)?)
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTask returns Task
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (duration=INT durationUnit=DURATION_UNIT)? 
	 *         startDate=Date? 
	 *         endDate=Date? 
	 *         dependency=Dependency? 
	 *         (subtasks+=AbstractTask subtasks+=AbstractTask*)?
	 *     )
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
