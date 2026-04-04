/**
 */
package tasksetmodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tasksetmodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasksetmodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TasksetmodelTests("tasksetmodel Tests");
		suite.addTestSuite(TaskSetTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(ConnectionTest.class);
		suite.addTestSuite(PortTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksetmodelTests(String name) {
		super(name);
	}

} //TasksetmodelTests
