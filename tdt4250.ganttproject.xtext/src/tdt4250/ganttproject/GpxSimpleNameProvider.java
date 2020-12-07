package tdt4250.ganttproject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.SimpleNameProvider;

import tdt4250.ganttproject.gpx.AbstractTask;

public class GpxSimpleNameProvider extends SimpleNameProvider {
	
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof AbstractTask) {
			return QualifiedName.create(((AbstractTask)obj).getName());
		}
		return super.getFullyQualifiedName(obj);
	}

}
