/**
 */
package tasksetmodel.tests;

import junit.textui.TestRunner;

import tasksetmodel.TaskSet;
import tasksetmodel.TasksetmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskSetTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskSetTest.class);
	}

	/**
	 * Constructs a new Task Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskSet getFixture() {
		return (TaskSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TasksetmodelFactory.eINSTANCE.createTaskSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TaskSetTest
