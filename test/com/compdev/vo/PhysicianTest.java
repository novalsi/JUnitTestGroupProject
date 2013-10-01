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
public class PhysicianTest {
    
    public PhysicianTest() {
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
     * Test of getName method, of class Physician.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Physician instance = new Physician();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Physician.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Physician instance = new Physician();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhysicianId method, of class Physician.
     */
    @Test
    public void testGetPhysicianId() {
        System.out.println("getPhysicianId");
        Physician instance = new Physician();
        int expResult = 0;
        int result = instance.getPhysicianId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhysicianId method, of class Physician.
     */
    @Test
    public void testSetPhysicianId() {
        System.out.println("setPhysicianId");
        int physicianId = 0;
        Physician instance = new Physician();
        instance.setPhysicianId(physicianId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}