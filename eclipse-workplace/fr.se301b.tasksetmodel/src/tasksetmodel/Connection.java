/**
 */
package tasksetmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tasksetmodel.Connection#getMaxQueueLen <em>Max Queue Len</em>}</li>
 *   <li>{@link tasksetmodel.Connection#getDstPort <em>Dst Port</em>}</li>
 *   <li>{@link tasksetmodel.Connection#getSourcePort <em>Source Port</em>}</li>
 * </ul>
 *
 * @see tasksetmodel.TasksetmodelPackage#getConnection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidDirection SameDatatype ValidQueueSize'"
 * @generated
 */
public interface Connection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Max Queue Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Queue Len</em>' attribute.
	 * @see #setMaxQueueLen(int)
	 * @see tasksetmodel.TasksetmodelPackage#getConnection_MaxQueueLen()
	 * @model
	 * @generated
	 */
	int getMaxQueueLen();

	/**
	 * Sets the value of the '{@link tasksetmodel.Connection#getMaxQueueLen <em>Max Queue Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Queue Len</em>' attribute.
	 * @see #getMaxQueueLen()
	 * @generated
	 */
	void setMaxQueueLen(int value);

	/**
	 * Returns the value of the '<em><b>Dst Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Port</em>' reference.
	 * @see #setDstPort(Port)
	 * @see tasksetmodel.TasksetmodelPackage#getConnection_DstPort()
	 * @model required="true"
	 * @generated
	 */
	Port getDstPort();

	/**
	 * Sets the value of the '{@link tasksetmodel.Connection#getDstPort <em>Dst Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst Port</em>' reference.
	 * @see #getDstPort()
	 * @generated
	 */
	void setDstPort(Port value);

	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(Port)
	 * @see tasksetmodel.TasksetmodelPackage#getConnection_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	Port getSourcePort();

	/**
	 * Sets the value of the '{@link tasksetmodel.Connection#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(Port value);

} // Connection
