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
public class creditCardTest {
    
    public creditCardTest() {
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
     * Test of getBankName method, of class creditCard.
     */
    @Test
    public void testGetBankName() {
        System.out.println("getBankName");
        creditCard instance = new creditCard();
        String expResult = "";
        String result = instance.getBankName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setBankName method, of class creditCard.
     */
    @Test
    public void testSetBankName() {
        System.out.println("setBankName");
        String bankName = "";
        creditCard instance = new creditCard();
        instance.setBankName(bankName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCardNo method, of class creditCard.
     */
    @Test
    public void testGetCardNo() {
        System.out.println("getCardNo");
        creditCard instance = new creditCard();
        String expResult = "";
        String result = instance.getCardNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCardNo method, of class creditCard.
     */
    @Test
    public void testSetCardNo() {
        System.out.println("setCardNo");
        String cardNo = "";
        creditCard instance = new creditCard();
        instance.setCardNo(cardNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getExpiredDate method, of class creditCard.
     */
    @Test
    public void testGetExpiredDate() {
        System.out.println("getExpiredDate");
        creditCard instance = new creditCard();
        String expResult = "";
        String result = instance.getExpiredDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setExpiredDate method, of class creditCard.
     */
    @Test
    public void testSetExpiredDate() {
        System.out.println("setExpiredDate");
        String expiredDate = "";
        creditCard instance = new creditCard();
        instance.setExpiredDate(expiredDate);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCVVNo method, of class creditCard.
     */
    @Test
    public void testGetCVVNo() {
        System.out.println("getCVVNo");
        creditCard instance = new creditCard();
        int expResult = 0;
        int result = instance.getCVVNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCVVNo method, of class creditCard.
     */
    @Test
    public void testSetCVVNo() {
        System.out.println("setCVVNo");
        int CVVNo = 0;
        creditCard instance = new creditCard();
        instance.setCVVNo(CVVNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of authorized method, of class creditCard.
     */
    @Test
    public void testAuthorized() {
        System.out.println("authorized");
        creditCard instance = new creditCard();
        boolean expResult = false;
        boolean result = instance.authorized();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class creditCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        creditCard instance = new creditCard();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
