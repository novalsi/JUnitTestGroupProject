/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.vo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author student
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.compdev.vo.PhlebotomistTest.class, com.compdev.vo.PhysicianTest.class, com.compdev.vo.AppointmentTest.class, com.compdev.vo.PatientTest.class, com.compdev.vo.PatientServiceCenterTest.class, com.compdev.vo.LabTestTest.class})
public class VoSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}