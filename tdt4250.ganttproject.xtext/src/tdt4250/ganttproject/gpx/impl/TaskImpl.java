/**
 * generated by Xtext 2.23.0
 */
package tdt4250.ganttproject.gpx.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tdt4250.ganttproject.gpx.AbstractTask;
import tdt4250.ganttproject.gpx.DURATION_UNIT;
import tdt4250.ganttproject.gpx.GpxPackage;
import tdt4250.ganttproject.gpx.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.ganttproject.gpx.impl.TaskImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link tdt4250.ganttproject.gpx.impl.TaskImpl#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link tdt4250.ganttproject.gpx.impl.TaskImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tdt4250.ganttproject.gpx.impl.TaskImpl#getSubtasks <em>Subtasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends AbstractTaskImpl implements Task {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationUnit() <em>Duration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnit()
	 * @generated
	 * @ordered
	 */
	protected static final DURATION_UNIT DURATION_UNIT_EDEFAULT = DURATION_UNIT.DAY;

	/**
	 * The cached value of the '{@link #getDurationUnit() <em>Duration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnit()
	 * @generated
	 * @ordered
	 */
	protected DURATION_UNIT durationUnit = DURATION_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubtasks() <em>Subtasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtasks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTask> subtasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TASK__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DURATION_UNIT getDurationUnit() {
		return durationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationUnit(DURATION_UNIT newDurationUnit) {
		DURATION_UNIT oldDurationUnit = durationUnit;
		durationUnit = newDurationUnit == null ? DURATION_UNIT_EDEFAULT : newDurationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TASK__DURATION_UNIT, oldDurationUnit, durationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TASK__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTask> getSubtasks() {
		if (subtasks == null) {
			subtasks = new EObjectContainmentEList<AbstractTask>(AbstractTask.class, this, GpxPackage.TASK__SUBTASKS);
		}
		return subtasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.TASK__SUBTASKS:
				return ((InternalEList<?>)getSubtasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpxPackage.TASK__DURATION:
				return getDuration();
			case GpxPackage.TASK__DURATION_UNIT:
				return getDurationUnit();
			case GpxPackage.TASK__START_DATE:
				return getStartDate();
			case GpxPackage.TASK__SUBTASKS:
				return getSubtasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GpxPackage.TASK__DURATION:
				setDuration((Integer)newValue);
				return;
			case GpxPackage.TASK__DURATION_UNIT:
				setDurationUnit((DURATION_UNIT)newValue);
				return;
			case GpxPackage.TASK__START_DATE:
				setStartDate((Date)newValue);
				return;
			case GpxPackage.TASK__SUBTASKS:
				getSubtasks().clear();
				getSubtasks().addAll((Collection<? extends AbstractTask>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GpxPackage.TASK__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GpxPackage.TASK__DURATION_UNIT:
				setDurationUnit(DURATION_UNIT_EDEFAULT);
				return;
			case GpxPackage.TASK__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case GpxPackage.TASK__SUBTASKS:
				getSubtasks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GpxPackage.TASK__DURATION:
				return duration != DURATION_EDEFAULT;
			case GpxPackage.TASK__DURATION_UNIT:
				return durationUnit != DURATION_UNIT_EDEFAULT;
			case GpxPackage.TASK__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case GpxPackage.TASK__SUBTASKS:
				return subtasks != null && !subtasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (duration: ");
		result.append(duration);
		result.append(", durationUnit: ");
		result.append(durationUnit);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(')');
		return result.toString();
	}

} //TaskImpl