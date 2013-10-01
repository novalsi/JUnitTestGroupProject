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
public class PatientServiceCenterTest {
    
    public PatientServiceCenterTest() {
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
     * Test of getPscId method, of class PatientServiceCenter.
     */
    @Test
    public void testGetPscId() {
        System.out.println("getPscId");
        PatientServiceCenter instance = new PatientServiceCenter();
        String expResult = "";
        String result = instance.getPscId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPscId method, of class PatientServiceCenter.
     */
    @Test
    public void testSetPscId() {
        System.out.println("setPscId");
        String pscId = "";
        PatientServiceCenter instance = new PatientServiceCenter();
        instance.setPscId(pscId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPscName method, of class PatientServiceCenter.
     */
    @Test
    public void testGetPscName() {
        System.out.println("getPscName");
        PatientServiceCenter instance = new PatientServiceCenter();
        String expResult = "";
        String result = instance.getPscName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPscName method, of class PatientServiceCenter.
     */
    @Test
    public void testSetPscName() {
        System.out.println("setPscName");
        String pscName = "";
        PatientServiceCenter instance = new PatientServiceCenter();
        instance.setPscName(pscName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}