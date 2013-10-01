/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.dbutil;

import com.compdev.vo.Appointment;
import com.compdev.vo.Patient;
import java.util.ArrayList;
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
public class BusinessDelegatorTest {
    
    public BusinessDelegatorTest() {
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
     * Test of isValidPatient method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPatient() throws Exception {
        System.out.println("isValidPatient");
        String p_patientId = "";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPatient(p_patientId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientById method, of class BusinessDelegator.
     */
    @Test
    public void testGetPatientById() throws Exception {
        System.out.println("getPatientById");
        String p_patientId = "";
        Patient expResult = null;
        Patient result = BusinessDelegator.getPatientById(p_patientId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientByDetails method, of class BusinessDelegator.
     */
    @Test
    public void testGetPatientByDetails() throws Exception {
        System.out.println("getPatientByDetails");
        Patient p_patient = null;
        Patient expResult = null;
        Patient result = BusinessDelegator.getPatientByDetails(p_patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPhelbotomist method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPhelbotomist() throws Exception {
        System.out.println("isValidPhelbotomist");
        String p_phelbotomist = "";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPhelbotomist(p_phelbotomist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPhysician method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPhysician() throws Exception {
        System.out.println("isValidPhysician");
        String p_physician = "";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPhysician(p_physician);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDSMCode method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidDSMCode() throws Exception {
        System.out.println("isValidDSMCode");
        String p_dsmcode = "";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidDSMCode(p_dsmcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPSC method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPSC() throws Exception {
        System.out.println("isValidPSC");
        String p_PSCCode = "";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPSC(p_PSCCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidLabTest method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidLabTest() throws Exception {
        System.out.println("isValidLabTest");
        String p_LabTestCode = "";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidLabTest(p_LabTestCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPSCAvailable method, of class BusinessDelegator.
     */
    @Test
    public void testIsPSCAvailable() throws Exception {
        System.out.println("isPSCAvailable");
        Appointment p_appointment = null;
        boolean expResult = false;
        boolean result = BusinessDelegator.isPSCAvailable(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAppointment method, of class BusinessDelegator.
     */
    @Test
    public void testCreateAppointment() throws Exception {
        System.out.println("createAppointment");
        Appointment p_Appointment = null;
        String expResult = "";
        String result = BusinessDelegator.createAppointment(p_Appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPhlebotomists method, of class BusinessDelegator.
     */
    @Test
    public void testGetAllPhlebotomists() throws Exception {
        System.out.println("getAllPhlebotomists");
        ArrayList expResult = null;
        ArrayList result = BusinessDelegator.getAllPhlebotomists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPSCs method, of class BusinessDelegator.
     */
    @Test
    public void testGetAllPSCs() throws Exception {
        System.out.println("getAllPSCs");
        ArrayList expResult = null;
        ArrayList result = BusinessDelegator.getAllPSCs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPhlebotomistAvailable method, of class BusinessDelegator.
     */
    @Test
    public void testIsPhlebotomistAvailable() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        Appointment p_appointment = null;
        boolean expResult = false;
        boolean result = BusinessDelegator.isPhlebotomistAvailable(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class BusinessDelegator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BusinessDelegator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}