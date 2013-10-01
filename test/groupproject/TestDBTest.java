/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class TestDBTest {
    
    public TestDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TestDB.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestDB.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnderline method, of class TestDB.
     */
    @Test
    public void testGetUnderline() {
        System.out.println("getUnderline");
        String str = "";
        String expResult = "";
        String result = TestDB.getUnderline(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}