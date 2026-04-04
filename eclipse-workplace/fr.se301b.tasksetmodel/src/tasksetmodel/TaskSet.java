/**
 */
package tasksetmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tasksetmodel.TaskSet#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link tasksetmodel.TaskSet#getTask <em>Task</em>}</li>
 *   <li>{@link tasksetmodel.TaskSet#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see tasksetmodel.TasksetmodelPackage#getTaskSet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueTaskNames'"
 * @generated
 */
public interface TaskSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link tasksetmodel.SchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' attribute.
	 * @see tasksetmodel.SchedulingPolicy
	 * @see #setSchedulingPolicy(SchedulingPolicy)
	 * @see tasksetmodel.TasksetmodelPackage#getTaskSet_SchedulingPolicy()
	 * @model
	 * @generated
	 */
	SchedulingPolicy getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link tasksetmodel.TaskSet#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' attribute.
	 * @see tasksetmodel.SchedulingPolicy
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(SchedulingPolicy value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link tasksetmodel.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see tasksetmodel.TasksetmodelPackage#getTaskSet_Task()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link tasksetmodel.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see tasksetmodel.TasksetmodelPackage#getTaskSet_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

} // TaskSet
