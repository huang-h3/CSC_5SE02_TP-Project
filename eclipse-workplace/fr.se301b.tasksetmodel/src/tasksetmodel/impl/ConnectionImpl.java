/**
 */
package tasksetmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tasksetmodel.Connection;
import tasksetmodel.Port;
import tasksetmodel.TasksetmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tasksetmodel.impl.ConnectionImpl#getMaxQueueLen <em>Max Queue Len</em>}</li>
 *   <li>{@link tasksetmodel.impl.ConnectionImpl#getDstPort <em>Dst Port</em>}</li>
 *   <li>{@link tasksetmodel.impl.ConnectionImpl#getSourcePort <em>Source Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends NamedElementImpl implements Connection {
	/**
	 * The default value of the '{@link #getMaxQueueLen() <em>Max Queue Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueLen()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_QUEUE_LEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxQueueLen() <em>Max Queue Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueLen()
	 * @generated
	 * @ordered
	 */
	protected int maxQueueLen = MAX_QUEUE_LEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDstPort() <em>Dst Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstPort()
	 * @generated
	 * @ordered
	 */
	protected Port dstPort;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Port sourcePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksetmodelPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxQueueLen() {
		return maxQueueLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQueueLen(int newMaxQueueLen) {
		int oldMaxQueueLen = maxQueueLen;
		maxQueueLen = newMaxQueueLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetmodelPackage.CONNECTION__MAX_QUEUE_LEN, oldMaxQueueLen, maxQueueLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getDstPort() {
		if (dstPort != null && dstPort.eIsProxy()) {
			InternalEObject oldDstPort = (InternalEObject)dstPort;
			dstPort = (Port)eResolveProxy(oldDstPort);
			if (dstPort != oldDstPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetmodelPackage.CONNECTION__DST_PORT, oldDstPort, dstPort));
			}
		}
		return dstPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetDstPort() {
		return dstPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDstPort(Port newDstPort) {
		Port oldDstPort = dstPort;
		dstPort = newDstPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetmodelPackage.CONNECTION__DST_PORT, oldDstPort, dstPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (Port)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetmodelPackage.CONNECTION__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePort(Port newSourcePort) {
		Port oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetmodelPackage.CONNECTION__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TasksetmodelPackage.CONNECTION__MAX_QUEUE_LEN:
				return getMaxQueueLen();
			case TasksetmodelPackage.CONNECTION__DST_PORT:
				if (resolve) return getDstPort();
				return basicGetDstPort();
			case TasksetmodelPackage.CONNECTION__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TasksetmodelPackage.CONNECTION__MAX_QUEUE_LEN:
				setMaxQueueLen((Integer)newValue);
				return;
			case TasksetmodelPackage.CONNECTION__DST_PORT:
				setDstPort((Port)newValue);
				return;
			case TasksetmodelPackage.CONNECTION__SOURCE_PORT:
				setSourcePort((Port)newValue);
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
			case TasksetmodelPackage.CONNECTION__MAX_QUEUE_LEN:
				setMaxQueueLen(MAX_QUEUE_LEN_EDEFAULT);
				return;
			case TasksetmodelPackage.CONNECTION__DST_PORT:
				setDstPort((Port)null);
				return;
			case TasksetmodelPackage.CONNECTION__SOURCE_PORT:
				setSourcePort((Port)null);
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
			case TasksetmodelPackage.CONNECTION__MAX_QUEUE_LEN:
				return maxQueueLen != MAX_QUEUE_LEN_EDEFAULT;
			case TasksetmodelPackage.CONNECTION__DST_PORT:
				return dstPort != null;
			case TasksetmodelPackage.CONNECTION__SOURCE_PORT:
				return sourcePort != null;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * * * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
	    String sourceName = (this.getSourcePort() != null) ? this.getSourcePort().getQualifiedName() : "null";
	    String destName = (this.getDstPort() != null) ? this.getDstPort().getQualifiedName() : "null";
	    
	    return this.getName() + ":" + sourceName + "->" + destName;
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
		result.append(" (maxQueueLen: ");
		result.append(maxQueueLen);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
