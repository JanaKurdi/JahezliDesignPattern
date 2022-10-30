/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class CheckerTest {
    
    public CheckerTest() {
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
     * Test of isValidExpiryDate method, of class Checker.
     */
    @Test
    public void testIsValidExpiryDate() {
        System.out.println("isValidExpiryDate");
        String ExpiryDate = "";
        boolean expResult = true;
        boolean result = Checker.isValidExpiryDate(ExpiryDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isValidCVVNumber method, of class Checker.
     */
    @Test
    public void testIsValidCVVNumber_String() {
        System.out.println("isValidCVVNumber");
        String str = "";
        boolean expResult = true;
        boolean result = Checker.isValidCVVNumber(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isValidCardNumber method, of class Checker.
     */
    @Test
    public void testIsValidCardNumber() {
        System.out.println("isValidCardNumber");
        String cardNum = "";
        boolean expResult = true;
        boolean result = Checker.isValidCardNumber(cardNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sumOfDoubleEvenPlace method, of class Checker.
     */
    @Test
    public void testSumOfDoubleEvenPlace() {
        System.out.println("sumOfDoubleEvenPlace");
        long cardNumber = 0L;
        int expResult = 0;
        int result = Checker.sumOfDoubleEvenPlace(cardNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDigit method, of class Checker.
     */
    @Test
    public void testGetDigit() {
        System.out.println("getDigit");
        int number = 0;
        int expResult = 0;
        int result = Checker.getDigit(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sumOfOddPlace method, of class Checker.
     */
    @Test
    public void testSumOfOddPlace() {
        System.out.println("sumOfOddPlace");
        long cardNumber = 0L;
        int expResult = 0;
        int result = Checker.sumOfOddPlace(cardNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of prefixMatched method, of class Checker.
     */
    @Test
    public void testPrefixMatched() {
        System.out.println("prefixMatched");
        long cardNumber = 0L;
        int prefix = 0;
        boolean expResult = false;
        boolean result = Checker.prefixMatched(cardNumber, prefix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSize method, of class Checker.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        long cardNumber = 0L;
        int expResult = 0;
        int result = Checker.getSize(cardNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrefix method, of class Checker.
     */
    @Test
    public void testGetPrefix() {
        System.out.println("getPrefix");
        long cardNumber = 0L;
        int sizeOfThePrefix = 0;
        long expResult = 0L;
        long result = Checker.getPrefix(cardNumber, sizeOfThePrefix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isValidCVVNumber method, of class Checker.
     */
    @Test
    public void testIsValidCVVNumber_int() {
        System.out.println("isValidCVVNumber");
        int CVV = 0;
        boolean expResult = false;
        boolean result = Checker.isValidCVVNumber(CVV);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
