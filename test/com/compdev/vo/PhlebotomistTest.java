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
public class PhlebotomistTest {
    
    public PhlebotomistTest() {
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
     * Test of getName method, of class Phlebotomist.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Phlebotomist instance = new Phlebotomist();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Phlebotomist.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Phlebotomist instance = new Phlebotomist();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhlebotomistId method, of class Phlebotomist.
     */
    @Test
    public void testGetPhlebotomistId() {
        System.out.println("getPhlebotomistId");
        Phlebotomist instance = new Phlebotomist();
        String expResult = "";
        String result = instance.getPhlebotomistId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhlebotomistId method, of class Phlebotomist.
     */
    @Test
    public void testSetPhlebotomistId() {
        System.out.println("setPhlebotomistId");
        String phlebotomistId = "";
        Phlebotomist instance = new Phlebotomist();
        instance.setPhlebotomistId(phlebotomistId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}