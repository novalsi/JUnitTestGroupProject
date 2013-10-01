/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.util;

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
public class ValidateTest {
    
    public ValidateTest() {
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
     * Test of isPureString method, of class Validate.
     */
    @Test
    public void testIsPureString() {
        System.out.println("isPureString");
        String str = "";
        boolean expResult = false;
        boolean result = Validate.isPureString(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidName method, of class Validate.
     */
    @Test
    public void testIsValidName() {
        System.out.println("isValidName");
        String strName = "";
        boolean expResult = false;
        boolean result = Validate.isValidName(strName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPureInteger method, of class Validate.
     */
    @Test
    public void testIsPureInteger() {
        System.out.println("isPureInteger");
        String str = "";
        boolean expResult = false;
        boolean result = Validate.isPureInteger(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDate method, of class Validate.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String strDate = "";
        boolean expResult = false;
        boolean result = Validate.isValidDate(strDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDXCode method, of class Validate.
     */
    @Test
    public void testIsValidDXCode() {
        System.out.println("isValidDXCode");
        String dxCode = "";
        boolean expResult = false;
        boolean result = Validate.isValidDXCode(dxCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidAppointmentTime method, of class Validate.
     */
    @Test
    public void testIsValidAppointmentTime() {
        System.out.println("isValidAppointmentTime");
        String strtime = "";
        boolean expResult = false;
        boolean result = Validate.isValidAppointmentTime(strtime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidAppointmentDate method, of class Validate.
     */
    @Test
    public void testIsValidAppointmentDate() {
        System.out.println("isValidAppointmentDate");
        String strDate = "";
        boolean expResult = false;
        boolean result = Validate.isValidAppointmentDate(strDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Validate.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Validate.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}