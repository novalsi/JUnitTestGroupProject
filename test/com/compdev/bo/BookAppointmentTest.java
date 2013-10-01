/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.bo;

import com.compdev.vo.Appointment;
import com.compdev.vo.Patient;
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
public class BookAppointmentTest {
    
    public BookAppointmentTest() {
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
     * Test of checkAvailability method, of class BookAppointment.
     */
    @Test
    public void testCheckAvailability() throws Exception {
        System.out.println("checkAvailability");
        Appointment p_appointment = null;
        BookAppointment instance = new BookAppointment();
        boolean expResult = false;
        boolean result = instance.checkAvailability(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeAppointment method, of class BookAppointment.
     */
    @Test
    public void testMakeAppointment() throws Exception {
        System.out.println("makeAppointment");
        Appointment p_appointment = null;
        BookAppointment instance = new BookAppointment();
        String expResult = "";
        String result = instance.makeAppointment(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextAppointment method, of class BookAppointment.
     */
    @Test
    public void testGetNextAppointment() throws Exception {
        System.out.println("getNextAppointment");
        Appointment p_appointment = null;
        BookAppointment instance = new BookAppointment();
        Appointment expResult = null;
        Appointment result = instance.getNextAppointment(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientInfoById method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoById() throws Exception {
        System.out.println("getPatientInfoById");
        String p_patientId = "";
        BookAppointment instance = new BookAppointment();
        Patient expResult = null;
        Patient result = instance.getPatientInfoById(p_patientId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientInfoByDetails method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoByDetails() throws Exception {
        System.out.println("getPatientInfoByDetails");
        Patient p_patient = null;
        BookAppointment instance = new BookAppointment();
        Patient expResult = null;
        Patient result = instance.getPatientInfoByDetails(p_patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}