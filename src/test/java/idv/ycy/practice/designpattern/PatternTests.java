package idv.ycy.practice.designpattern;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PatternTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(PatternTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(SingletonTest.class);
		//$JUnit-END$
		return suite;
	}

}
