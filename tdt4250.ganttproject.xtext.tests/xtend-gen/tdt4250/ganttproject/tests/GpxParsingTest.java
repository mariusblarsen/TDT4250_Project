/**
 * generated by Xtext 2.23.0
 */
package tdt4250.ganttproject.tests;

import com.google.inject.Inject;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tdt4250.ganttproject.gpx.AbstractTask;
import tdt4250.ganttproject.gpx.DURATION_UNIT;
import tdt4250.ganttproject.gpx.GpxPackage;
import tdt4250.ganttproject.gpx.Milestone;
import tdt4250.ganttproject.gpx.Project;
import tdt4250.ganttproject.gpx.Task;
import tdt4250.ganttproject.tests.GpxInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(GpxInjectorProvider.class)
@SuppressWarnings("all")
public class GpxParsingTest {
  @Inject
  private ParseHelper<Project> parseHelper;
  
  @Inject
  private IResourceValidator resourceValidator;
  
  @Test
  public void loadModel() {
    try {
      GpxPackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Project \'MyProject\'");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Task \'Task 1\'{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Task \'Task 1.1\' lasts 5 days from 10.11.20;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Task \'Task 1.2\' lasts 1 day, depends on \'Task 1.1\'");
      _builder.newLine();
      _builder.append("};");
      _builder.newLine();
      _builder.append("Task \'Task 2\' lasts 10 days, depends on \'Task 2\';");
      _builder.newLine();
      _builder.append("Milestone \'Phase 1\' planned 27.11.20, depends on \'Task 2\';");
      _builder.newLine();
      _builder.append("Task \'Task 3\' depends on \'Phase 1\'{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Task \'Task 3.1\' from 29.11.20 due 30.11.20;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Task \'Task 3.2\' lasts 1 day;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Task \'Task 3.3\' lasts 1 week, depends on \'Task 3.1\', \'Task 1\'");
      _builder.newLine();
      _builder.append("};");
      _builder.newLine();
      _builder.append("Task \'Task 4\' lasts 10 days, depends on \'Task 3.1\'");
      _builder.newLine();
      final Project result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      Assertions.assertEquals("MyProject", result.getName());
      Assertions.assertEquals(5, result.getTasks().size());
      AbstractTask _get = result.getTasks().get(2);
      Assertions.assertTrue((_get instanceof Milestone));
      AbstractTask _get_1 = result.getTasks().get(3);
      Assertions.assertTrue((_get_1 instanceof Task));
      AbstractTask _get_2 = result.getTasks().get(0);
      final Task task1 = ((Task) _get_2);
      Assertions.assertEquals(2, task1.getSubtasks().size());
      AbstractTask _get_3 = result.getTasks().get(2);
      final Milestone milestone1 = ((Milestone) _get_3);
      Assertions.assertNotNull(milestone1.getEndDate());
      AbstractTask _get_4 = result.getTasks().get(3);
      final Task task3 = ((Task) _get_4);
      Assertions.assertEquals(3, task3.getSubtasks().size());
      Assertions.assertSame(milestone1, task3.getDependency().getDependees().get(0));
      AbstractTask _get_5 = task3.getSubtasks().get(0);
      final Task task31 = ((Task) _get_5);
      AbstractTask _get_6 = task3.getSubtasks().get(1);
      final Task task32 = ((Task) _get_6);
      AbstractTask _get_7 = task3.getSubtasks().get(2);
      final Task task33 = ((Task) _get_7);
      Date testDate = new Date(120, 10, 29);
      Assertions.assertEquals(testDate, task31.getStartDate());
      Assertions.assertEquals(1, task32.getDuration());
      Assertions.assertEquals(DURATION_UNIT.DAY, task32.getDurationUnit());
      Assertions.assertEquals(1, task33.getDuration());
      Assertions.assertEquals(DURATION_UNIT.WEEK, task33.getDurationUnit());
      Assertions.assertEquals(2, task33.getDependency().getDependees().size());
      Assertions.assertSame(task31, task33.getDependency().getDependees().get(0));
      Assertions.assertSame(task1, task33.getDependency().getDependees().get(1));
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      if (_isEmpty) {
        System.out.println("All good! (y)");
      } else {
        System.out.println(errors);
      }
      final List<Issue> issues = this.resourceValidator.validate(result.eResource(), 
        CheckMode.ALL, CancelIndicator.NullImpl);
      for (final Issue issue : issues) {
        Severity _severity = issue.getSeverity();
        String _plus = (_severity + ":");
        String _message = issue.getMessage();
        String _plus_1 = (_plus + _message);
        String _plus_2 = (_plus_1 + "(line: ");
        Integer _lineNumber = issue.getLineNumber();
        String _plus_3 = (_plus_2 + _lineNumber);
        String _plus_4 = (_plus_3 + ")");
        System.out.println(_plus_4);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
