package sofa.sofa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class test extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public test(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(test.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testAdd() {
        assertEquals(4, firstMaven.add(2, 2));
    }

    public void testMult() {
        assertEquals(4, firstMaven.mult(2, 2));
    }
}
