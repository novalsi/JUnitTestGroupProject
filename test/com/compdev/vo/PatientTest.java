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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of getAddress method, of class Patient.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Patient.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Patient instance = new Patient();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDob method, of class Patient.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class Patient.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        String dob = "";
        Patient instance = new Patient();
        instance.setDob(dob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Patient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Patient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Patient instance = new Patient();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInsurance method, of class Patient.
     */
    @Test
    public void testIsInsurance() {
        System.out.println("isInsurance");
        Patient instance = new Patient();
        boolean expResult = false;
        boolean result = instance.isInsurance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsurance method, of class Patient.
     */
    @Test
    public void testSetInsurance() {
        System.out.println("setInsurance");
        boolean insurance = false;
        Patient instance = new Patient();
        instance.setInsurance(insurance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientId method, of class Patient.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getPatientId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientId method, of class Patient.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        String patientId = "";
        Patient instance = new Patient();
        instance.setPatientId(patientId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhysicianId method, of class Patient.
     */
    @Test
    public void testGetPhysicianId() {
        System.out.println("getPhysicianId");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhysicianId method, of class Patient.
     */
    @Test
    public void testSetPhysicianId() {
        System.out.println("setPhysicianId");
        String physicianId = "";
        Patient instance = new Patient();
        instance.setPhysicianId(physicianId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}