/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.vo;

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
public class LabTestTest {
    
    public LabTestTest() {
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
     * Test of getCost method, of class LabTest.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        LabTest instance = new LabTest();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class LabTest.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 0.0;
        LabTest instance = new LabTest();
        instance.setCost(cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTestName method, of class LabTest.
     */
    @Test
    public void testGetTestName() {
        System.out.println("getTestName");
        LabTest instance = new LabTest();
        String expResult = "";
        String result = instance.getTestName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTestName method, of class LabTest.
     */
    @Test
    public void testSetTestName() {
        System.out.println("setTestName");
        String testName = "";
        LabTest instance = new LabTest();
        instance.setTestName(testName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTestNumber method, of class LabTest.
     */
    @Test
    public void testGetTestNumber() {
        System.out.println("getTestNumber");
        LabTest instance = new LabTest();
        int expResult = 0;
        int result = instance.getTestNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTestNumber method, of class LabTest.
     */
    @Test
    public void testSetTestNumber() {
        System.out.println("setTestNumber");
        int testNumber = 0;
        LabTest instance = new LabTest();
        instance.setTestNumber(testNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}