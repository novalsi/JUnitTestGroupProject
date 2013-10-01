/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.dbutil;

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
@Suite.SuiteClasses({com.compdev.dbutil.TestDBTest.class, com.compdev.dbutil.BusinessDelegatorTest.class})
public class DbutilSuite {

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