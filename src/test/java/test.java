

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import sofa.sofa.test;
import sofa.sofa.firstMaven;

/**
     * Unit test for simple App.
     */
     class firstMavenTest extends TestCase {
        /**
         * Create the test case
         *
         * @param testName name of the test case
         */
        public firstMavenTest(String testName) {
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
            assertEquals(5, firstMaven.add(2, 3));
        }

        public void testMult() {
            assertEquals(6, firstMaven.mult(2, 3));
        }
    }



