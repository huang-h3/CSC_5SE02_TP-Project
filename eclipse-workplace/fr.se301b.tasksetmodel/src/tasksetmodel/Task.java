/**
 */
package tasksetmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tasksetmodel.Task#getThreadKind <em>Thread Kind</em>}</li>
 *   <li>{@link tasksetmodel.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link tasksetmodel.Task#getPort <em>Port</em>}</li>
 *   <li>{@link tasksetmodel.Task#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see tasksetmodel.TasksetmodelPackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePortNames'"
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Thread Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tasksetmodel.ThreadKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Kind</em>' attribute.
	 * @see tasksetmodel.ThreadKind
	 * @see #setThreadKind(ThreadKind)
	 * @see tasksetmodel.TasksetmodelPackage#getTask_ThreadKind()
	 * @model
	 * @generated
	 */
	ThreadKind getThreadKind();

	/**
	 * Sets the value of the '{@link tasksetmodel.Task#getThreadKind <em>Thread Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Kind</em>' attribute.
	 * @see tasksetmodel.ThreadKind
	 * @see #getThreadKind()
	 * @generated
	 */
	void setThreadKind(ThreadKind value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see tasksetmodel.TasksetmodelPackage#getTask_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link tasksetmodel.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link tasksetmodel.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see tasksetmodel.TasksetmodelPackage#getTask_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see #setBehavior(String)
	 * @see tasksetmodel.TasksetmodelPackage#getTask_Behavior()
	 * @model
	 * @generated
	 */
	String getBehavior();

	/**
	 * Sets the value of the '{@link tasksetmodel.Task#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(String value);

} // Task
