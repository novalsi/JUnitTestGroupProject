/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.util;

import com.compdev.vo.Appointment;
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
public class AppointmentHelperTest {
    
    public AppointmentHelperTest() {
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
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment() throws Exception {
        System.out.println("validateAppointment");
        Appointment p_appointment = null;
        boolean expResult = false;
        boolean result = AppointmentHelper.validateAppointment(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isApponitmentAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsApponitmentAvailable() throws Exception {
        System.out.println("isApponitmentAvailable");
        Appointment p_appointment = null;
        Appointment expResult = null;
        Appointment result = AppointmentHelper.isApponitmentAvailable(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPhlebotomistAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsPhlebotomistAvailable() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        Appointment p_appointment = null;
        boolean expResult = false;
        boolean result = AppointmentHelper.isPhlebotomistAvailable(p_appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}