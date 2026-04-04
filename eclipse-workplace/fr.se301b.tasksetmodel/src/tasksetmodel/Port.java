/**
 */
package tasksetmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tasksetmodel.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link tasksetmodel.Port#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see tasksetmodel.TasksetmodelPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link tasksetmodel.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see tasksetmodel.PortDirection
	 * @see #setDirection(PortDirection)
	 * @see tasksetmodel.TasksetmodelPackage#getPort_Direction()
	 * @model default="in"
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link tasksetmodel.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see tasksetmodel.PortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link tasksetmodel.Datatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see tasksetmodel.Datatype
	 * @see #setDatatype(Datatype)
	 * @see tasksetmodel.TasksetmodelPackage#getPort_Datatype()
	 * @model
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link tasksetmodel.Port#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see tasksetmodel.Datatype
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

} // Port
