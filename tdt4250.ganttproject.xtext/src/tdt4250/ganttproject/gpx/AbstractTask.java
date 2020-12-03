/**
 * generated by Xtext 2.23.0
 */
package tdt4250.ganttproject.gpx;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.ganttproject.gpx.AbstractTask#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.ganttproject.gpx.AbstractTask#getEndDate <em>End Date</em>}</li>
 *   <li>{@link tdt4250.ganttproject.gpx.AbstractTask#getDependency <em>Dependency</em>}</li>
 *   <li>{@link tdt4250.ganttproject.gpx.AbstractTask#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see tdt4250.ganttproject.gpx.GpxPackage#getAbstractTask()
 * @model
 * @generated
 */
public interface AbstractTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.ganttproject.gpx.GpxPackage#getAbstractTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.ganttproject.gpx.AbstractTask#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see tdt4250.ganttproject.gpx.GpxPackage#getAbstractTask_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link tdt4250.ganttproject.gpx.AbstractTask#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.ganttproject.gpx.Dependency#getDependant <em>Dependant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference.
	 * @see #setDependency(Dependency)
	 * @see tdt4250.ganttproject.gpx.GpxPackage#getAbstractTask_Dependency()
	 * @see tdt4250.ganttproject.gpx.Dependency#getDependant
	 * @model opposite="dependant" containment="true"
	 * @generated
	 */
	Dependency getDependency();

	/**
	 * Sets the value of the '{@link tdt4250.ganttproject.gpx.AbstractTask#getDependency <em>Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' containment reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tdt4250.ganttproject.gpx.GpxPackage#getAbstractTask_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tdt4250.ganttproject.gpx.AbstractTask#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // AbstractTask