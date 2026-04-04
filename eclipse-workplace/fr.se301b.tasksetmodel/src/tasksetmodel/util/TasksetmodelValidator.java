/**
 */
package tasksetmodel.util;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import tasksetmodel.Connection;
import tasksetmodel.Datatype;
import tasksetmodel.NamedElement;
import tasksetmodel.Port;
import tasksetmodel.PortDirection;
import tasksetmodel.SchedulingPolicy;
import tasksetmodel.Task;
import tasksetmodel.TaskSet;
import tasksetmodel.TasksetmodelPackage;
import tasksetmodel.ThreadKind;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tasksetmodel.TasksetmodelPackage
 * @generated
 */
public class TasksetmodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TasksetmodelValidator INSTANCE = new TasksetmodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tasksetmodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksetmodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TasksetmodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TasksetmodelPackage.TASK_SET:
				return validateTaskSet((TaskSet)value, diagnostics, context);
			case TasksetmodelPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case TasksetmodelPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case TasksetmodelPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case TasksetmodelPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case TasksetmodelPackage.DATATYPE:
				return validateDatatype((Datatype)value, diagnostics, context);
			case TasksetmodelPackage.THREAD_KIND:
				return validateThreadKind((ThreadKind)value, diagnostics, context);
			case TasksetmodelPackage.PORT_DIRECTION:
				return validatePortDirection((PortDirection)value, diagnostics, context);
			case TasksetmodelPackage.SCHEDULING_POLICY:
				return validateSchedulingPolicy((SchedulingPolicy)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSet(TaskSet taskSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taskSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(taskSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskSet_UniqueTaskNames(taskSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTaskSet_UniqueTaskNames(TaskSet taskSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
	    Set<String> existingNames = new HashSet<>();

	    for (Task t : taskSet.getTask()) {
	        if (t.getName() != null) {
	            if (!existingNames.add(t.getName())) {
	                if (diagnostics != null) {
	                    diagnostics.add(new BasicDiagnostic(
	                        Diagnostic.ERROR,
	                        DIAGNOSTIC_SOURCE,
	                        0,
	                        "Task name '" + t.getName() + "' is not unique in the TaskSet.",
	                        new Object[] { taskSet }
	                    ));
	                }
	                return false;
	            }
	        }
	    }
	    return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_UniquePortNames(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_UniquePortNames(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
	    Set<String> existingNames = new HashSet<>();

	    for (Port p : task.getPort()) {
	        if (p.getName() != null) {
	            if (!existingNames.add(p.getName())) {
	                if (diagnostics != null) {
	                    diagnostics.add(new BasicDiagnostic(
	                        Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
	                        "Port name '" + p.getName() + "' is not unique within Task '" + task.getName(),
	                        new Object[] { task }
	                    ));
	                }
	                return false;
	            }
	        }
	    }
	    return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnection_ValidDirection(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnection_SameDatatype(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnection_ValidQueueSize(connection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnection_ValidDirection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	    boolean isValid = true;
	    
	    // Src port must be OUT
	    if (connection.getSourcePort() != null && connection.getSourcePort().getDirection() != PortDirection.OUT) {
	        isValid = false;
	    }
	    // Dst port must be IN
	    if (connection.getDstPort() != null && connection.getDstPort().getDirection() != PortDirection.IN) {
	        isValid = false;
	    }
	    
	    if (!isValid) {
	        if (diagnostics != null) {
	            diagnostics.add(new BasicDiagnostic(
	                Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
	                "Connection '" + connection.getName() + "': Source port MUST be 'out' and Destination port MUST be 'in'.",
	                new Object[] { connection }
	            ));
	        }
	        return false;
	    }
	    return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnection_SameDatatype(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	    if (connection.getSourcePort() != null && connection.getDstPort() != null) {

	        Object srcType = connection.getSourcePort().getDatatype();
	        Object dstType = connection.getDstPort().getDatatype();

	        if (srcType != null && dstType != null) {

	            if (!srcType.equals(dstType)) {
	                if (diagnostics != null) {
	                    diagnostics.add(new BasicDiagnostic(
	                        Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
	                        "Connection '" + connection.getName() + "' must link ports with the same data type. " +
	                        "(Src type:" + srcType + ", but Dst type: " + dstType + ")",
	                        new Object[] { connection }
	                    ));
	                }
	                return false;
	            }
	        }
	    }
	    return true;
	}
    public boolean validateConnection_ValidQueueSize(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (connection == null || connection.getSourcePort() == null || connection.getDstPort() == null) {
            return true;
        }

        if (!(connection.getSourcePort().eContainer() instanceof Task) ||
            !(connection.getDstPort().eContainer() instanceof Task)) {
            return true;
        }

        Task srcTask = (Task) connection.getSourcePort().eContainer();
        Task dstTask = (Task) connection.getDstPort().eContainer();

        int srcPeriod = srcTask.getPeriod();
        int dstPeriod = dstTask.getPeriod();
        int queueSize = connection.getMaxQueueLen();

        if (srcPeriod <= 0 || dstPeriod <= 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(
                    Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
                    "Connection '" + connection.getName() + "': periods must be > 0 " +
                    "(src=" + srcPeriod + ", dst=" + dstPeriod + ").",
                    new Object[] { connection }
                ));
            }
            return false;
        }

        // Number of messages that can arrive during one destination activation interval
        int requiredMsgs = (int) Math.ceil((double) dstPeriod / (double) srcPeriod);

        // Runtime ring-buffer keeps one slot empty to distinguish full from empty:
        // usable capacity = queue_size - 1
        int requiredQueueSize = requiredMsgs + 1;

        if (queueSize < requiredQueueSize) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(
                    Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
                    "Connection '" + connection.getName() + "': maxQueueLen (" + queueSize + ") is too small. " +
                    "For src period " + srcPeriod + " ms and dst period " + dstPeriod + " ms, " +
                    "minimum queue_size is " + requiredQueueSize +
                    " (stores " + requiredMsgs + " messages because one slot is reserved by runtime ring buffer).",
                    new Object[] { connection }
                ));
            }
            return false;
        }

        return true;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatype(Datatype datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreadKind(ThreadKind threadKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDirection(PortDirection portDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicy(SchedulingPolicy schedulingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TasksetmodelValidator
