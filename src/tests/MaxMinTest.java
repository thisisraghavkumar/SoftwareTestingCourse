package tests;
import core.MaxMin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MaxMinTest {
    
    public MaxMinTest() {
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

    @Test
    public void testGetMaxValue() {
        System.out.println("getMaxValue");
        int[] array ={1,2,3,4};
        int expResult = 4;
        int result = MaxMin.getMaxValue(array);
        assert(result==4);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
    @Test
    public void testGetMaxValue1() {
        System.out.println("getMaxValue");
        int[] array ={-1,9,8,0,-9};
        int expResult = 4;
        int result = MaxMin.getMaxValue(array);
        assertFalse(result==-9);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testGetMaxValue2() {
        System.out.println("getMaxValue");
        int[] array = {};
        int expResult = 4;
        int result = MaxMin.getMaxValue(array);
        assertTrue(result==4);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMinValue method, of class MaxMin.
     */
    @Test
    public void testGetMinValue() {
        System.out.println("getMinValue");
        int[] array = {1,2,3,4};
        int expResult = 1;
        int result = MaxMin.getMinValue(array);
        assert(result==1);
       
    }
    
}
