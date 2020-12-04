/**
 * generated by Xtext 2.23.0
 */
package tdt4250.ganttproject.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import tdt4250.ganttproject.generator.GpxCustomGenerator;
import tdt4250.ganttproject.gpx.Project;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GpxGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    fsa.generateFile("project.gan", GpxCustomGenerator.generate(((Project) _get)));
  }
}
