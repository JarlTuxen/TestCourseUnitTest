/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author jarltuxen
 */
public class ClassToBeTestedTest {
    
    public ClassToBeTestedTest() {
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
     * Test of add method, of class ClassToBeTested.
     */
    @Test
    public void testAdd() {
        System.out.println("add 2,2");
        String s1 = "2";
        String s2 = "2";
        ClassToBeTested instance = new ClassToBeTested();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add 3,2");
        String s1 = "3";
        String s2 = "2";
        ClassToBeTested instance = new ClassToBeTested();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }

    @Ignore
    @Test(timeout = 1)
    public void testAdd2a() {
        System.out.println("testAdd2a 3,2");
        String s1 = "3";
        String s2 = "2";
        ClassToBeTested instance = new ClassToBeTested();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }

    @Test(expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("testAdd3 3,biscuits");
        String s1 = "3";
        String s2 = "biscuits";
        ClassToBeTested instance = new ClassToBeTested();
        int result = instance.add(s1, s2);
    }
    
}
