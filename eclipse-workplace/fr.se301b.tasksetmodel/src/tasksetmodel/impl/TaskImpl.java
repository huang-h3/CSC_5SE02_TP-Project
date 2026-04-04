/**
 */
package tasksetmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tasksetmodel.Port;
import tasksetmodel.Task;
import tasksetmodel.TasksetmodelPackage;
import tasksetmodel.ThreadKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tasksetmodel.impl.TaskImpl#getThreadKind <em>Thread Kind</em>}</li>
 *   <li>{@link tasksetmodel.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link tasksetmodel.impl.TaskImpl#getPort <em>Port</em>}</li>
 *   <li>{@link tasksetmodel.impl.TaskImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
	/**
	 * The default value of the '{@link #getThreadKind() <em>Thread Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadKind()
	 * @generated
	 * @ordered
	 */
	protected static final ThreadKind THREAD_KIND_EDEFAULT = ThreadKind.SPORADIC;

	/**
	 * The cached value of the '{@link #getThreadKind() <em>Thread Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadKind()
	 * @generated
	 * @ordered
	 */
	protected ThreadKind threadKind = THREAD_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

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
		return TasksetmodelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadKind getThreadKind() {
		return threadKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadKind(ThreadKind newThreadKind) {
		ThreadKind oldThreadKind = threadKind;
		threadKind = newThreadKind == null ? THREAD_KIND_EDEFAULT : newThreadKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetmodelPackage.TASK__THREAD_KIND, oldThreadKind, threadKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetmodelPackage.TASK__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, TasksetmodelPackage.TASK__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetmodelPackage.TASK__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasksetmodelPackage.TASK__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case TasksetmodelPackage.TASK__THREAD_KIND:
				return getThreadKind();
			case TasksetmodelPackage.TASK__PERIOD:
				return getPeriod();
			case TasksetmodelPackage.TASK__PORT:
				return getPort();
			case TasksetmodelPackage.TASK__BEHAVIOR:
				return getBehavior();
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
			case TasksetmodelPackage.TASK__THREAD_KIND:
				setThreadKind((ThreadKind)newValue);
				return;
			case TasksetmodelPackage.TASK__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case TasksetmodelPackage.TASK__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case TasksetmodelPackage.TASK__BEHAVIOR:
				setBehavior((String)newValue);
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
			case TasksetmodelPackage.TASK__THREAD_KIND:
				setThreadKind(THREAD_KIND_EDEFAULT);
				return;
			case TasksetmodelPackage.TASK__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case TasksetmodelPackage.TASK__PORT:
				getPort().clear();
				return;
			case TasksetmodelPackage.TASK__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
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
			case TasksetmodelPackage.TASK__THREAD_KIND:
				return threadKind != THREAD_KIND_EDEFAULT;
			case TasksetmodelPackage.TASK__PERIOD:
				return period != PERIOD_EDEFAULT;
			case TasksetmodelPackage.TASK__PORT:
				return port != null && !port.isEmpty();
			case TasksetmodelPackage.TASK__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
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
		result.append(" (threadKind: ");
		result.append(threadKind);
		result.append(", period: ");
		result.append(period);
		result.append(", behavior: ");
		result.append(behavior);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
