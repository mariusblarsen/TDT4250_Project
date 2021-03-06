/*
 * generated by Xtext 2.23.0
 */
package tdt4250.ganttproject.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import tdt4250.ganttproject.generator.GpxCustomGenerator
import tdt4250.ganttproject.gpx.GpxPackage
import tdt4250.ganttproject.gpx.Project

@ExtendWith(InjectionExtension)
@InjectWith(GpxInjectorProvider)
class GpxTransformationTest {
	@Inject
	ParseHelper<Project> parseHelper
	
	@Test
	def void loadModel() {
		GpxPackage.eINSTANCE.eClass
		val result = parseHelper.parse('''
Project 'My_Project'

Task 'Task A' from 09.01.20 due 10.01.20;
Task 'Task B' lasts 1 day, depends on 'Task A';
Task 'Task C' {  
	Task 'Task C_1' lasts 1 day, depends on 'Task B'
};
Task 'Task D', depends on 'Task C' {
	Task 'Task D_1' lasts 1 day, depends on 'Task D'
}


		''')
		
		System.out.println(GpxCustomGenerator.generate(result))
		
	}
}
