/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.io.FileNotFoundException;
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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getPhone method, of class Customer.
     */
    @Test
    public void testGetPhone() throws FileNotFoundException {
        System.out.println("getPhone");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPhone method, of class Customer.
     */
    @Test
    public void testSetPhone() throws FileNotFoundException {
        System.out.println("setPhone");
        String phone = "053556633";
        Customer instance = new Customer();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCity method, of class Customer.
     */
    @Test
    public void testGetCity() throws FileNotFoundException {
        System.out.println("getCity");
        Customer instance = new Customer();
        String expResult = "Jeddah";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCity method, of class Customer.
     */
    @Test
    public void testSetCity() throws FileNotFoundException {
        System.out.println("setCity");
        String city = "Dammam";
        Customer instance = new Customer();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() throws FileNotFoundException {
        System.out.println("getName");
        Customer instance = new Customer();
        String expResult = "Razan";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class Customer.
     */
    @Test
    public void testSetName() throws FileNotFoundException {
        System.out.println("setName");
        String name = "";
        Customer instance = new Customer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getReserve method, of class Customer.
     */
    @Test
    public void testGetReserve() throws FileNotFoundException {
        System.out.println("getReserve");
        Customer instance = new Customer();
        Reservation expResult = null;
        Reservation result = instance.getReserve();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setReserve method, of class Customer.
     */
    @Test
    public void testSetReserve() throws FileNotFoundException {
        System.out.println("setReserve");
        Reservation reserve = null;
        Customer instance = new Customer();
        instance.setReserve(reserve);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of reserve method, of class Customer.
     */
    @Test
    public void testReserve() throws FileNotFoundException {
        System.out.println("reserve");
        Customer instance = new Customer();
        instance.reserve();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotalPrice method, of class Customer.
     */
    @Test
    public void testGetTotalPrice() throws FileNotFoundException {
        System.out.println("getTotalPrice");
        Customer instance = new Customer();
        double expResult = 0.0;
        double result = instance.getTotalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTotalPrice method, of class Customer.
     */
    @Test
    public void testSetTotalPrice() throws FileNotFoundException {
        System.out.println("setTotalPrice");
        Customer instance = new Customer();
        instance.setTotalPrice();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of makePayment method, of class Customer.
     */
    @Test
    public void testMakePayment() throws FileNotFoundException {
        System.out.println("makePayment");
        Customer instance = new Customer();
        paymentMethod expResult = null;
        paymentMethod result = instance.makePayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of makePaymentByCash method, of class Customer.
     */
    @Test
    public void testMakePaymentByCash() throws FileNotFoundException {
        System.out.println("makePaymentByCash");
        double totalPrice = 0.0;
        Customer instance = new Customer();
        Cash expResult = null;
        Cash result = instance.makePaymentByCash(totalPrice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of makePaymentByCreditCard method, of class Customer.
     */
    @Test
    public void testMakePaymentByCreditCard() throws FileNotFoundException {
        System.out.println("makePaymentByCreditCard");
        double total = 0.0;
        Customer instance = new Customer();
        creditCard expResult = null;
        creditCard result = instance.makePaymentByCreditCard(total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
