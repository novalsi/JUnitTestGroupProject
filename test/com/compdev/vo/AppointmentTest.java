/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.vo;

import java.util.HashMap;
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
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of getPhysicianId method, of class Appointment.
     */
    @Test
    public void testGetPhysicianId() {
        System.out.println("getPhysicianId");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhysicianId method, of class Appointment.
     */
    @Test
    public void testSetPhysicianId() {
        System.out.println("setPhysicianId");
        String physicianId = "";
        Appointment instance = new Appointment();
        instance.setPhysicianId(physicianId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentDate method, of class Appointment.
     */
    @Test
    public void testGetAppointmentDate() {
        System.out.println("getAppointmentDate");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getAppointmentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppointmentDate method, of class Appointment.
     */
    @Test
    public void testSetAppointmentDate() {
        System.out.println("setAppointmentDate");
        String appointmentDate = "";
        Appointment instance = new Appointment();
        instance.setAppointmentDate(appointmentDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentNumber method, of class Appointment.
     */
    @Test
    public void testGetAppointmentNumber() {
        System.out.println("getAppointmentNumber");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getAppointmentNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppointmentNumber method, of class Appointment.
     */
    @Test
    public void testSetAppointmentNumber() {
        System.out.println("setAppointmentNumber");
        String appointmentNumber = "";
        Appointment instance = new Appointment();
        instance.setAppointmentNumber(appointmentNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentTime method, of class Appointment.
     */
    @Test
    public void testGetAppointmentTime() {
        System.out.println("getAppointmentTime");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getAppointmentTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppointmentTime method, of class Appointment.
     */
    @Test
    public void testSetAppointmentTime() {
        System.out.println("setAppointmentTime");
        String appointmentTime = "";
        Appointment instance = new Appointment();
        instance.setAppointmentTime(appointmentTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientId method, of class Appointment.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getPatientId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientId method, of class Appointment.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        String patientId = "";
        Appointment instance = new Appointment();
        instance.setPatientId(patientId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientServiceCenterCode method, of class Appointment.
     */
    @Test
    public void testGetPatientServiceCenterCode() {
        System.out.println("getPatientServiceCenterCode");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getPatientServiceCenterCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientServiceCenterCode method, of class Appointment.
     */
    @Test
    public void testSetPatientServiceCenterCode() {
        System.out.println("setPatientServiceCenterCode");
        String patientServiceCenterCode = "";
        Appointment instance = new Appointment();
        instance.setPatientServiceCenterCode(patientServiceCenterCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhlebotomistId method, of class Appointment.
     */
    @Test
    public void testGetPhlebotomistId() {
        System.out.println("getPhlebotomistId");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getPhlebotomistId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhlebotomistId method, of class Appointment.
     */
    @Test
    public void testSetPhlebotomistId() {
        System.out.println("setPhlebotomistId");
        String phlebotomistId = "";
        Appointment instance = new Appointment();
        instance.setPhlebotomistId(phlebotomistId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTestDetails method, of class Appointment.
     */
    @Test
    public void testGetTestDetails() {
        System.out.println("getTestDetails");
        Appointment instance = new Appointment();
        HashMap expResult = null;
        HashMap result = instance.getTestDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTestDetails method, of class Appointment.
     */
    @Test
    public void testSetTestDetails() {
        System.out.println("setTestDetails");
        HashMap<String, String> testDetails = null;
        Appointment instance = new Appointment();
        instance.setTestDetails(testDetails);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}