/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import jahezli.app.Reservation;
import java.util.Date;
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
public class ReservationTest {
    
    public ReservationTest() {
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
     * Test of getDate method, of class Reservation.
     */
//    @Test
//    public void testGetDate() {
//        System.out.println("getDate");
//        Reservation instance = new Reservation();
//        Date expResult = null;
//        Date result = instance.getDate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDate method, of class Reservation.
//     */
//    @Test
//    public void testSetDate() {
//        System.out.println("setDate");
//        Date date = null;
//        Reservation instance = new Reservation();
//        instance.setDate(date);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTime method, of class Reservation.
//     */
//    @Test
//    public void testGetTime() {
//        System.out.println("getTime");
//        Reservation instance = new Reservation();
//        int expResult = 0;
//        int result = instance.getTime();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTime method, of class Reservation.
//     */
//    @Test
//    public void testSetTime() {
//        System.out.println("setTime");
//        int time = 0;
//        Reservation instance = new Reservation();
//        instance.setTime(time);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPersonNo method, of class Reservation.
//     */
//    @Test
//    public void testGetPersonNo() {
//        System.out.println("getPersonNo");
//        Reservation instance = new Reservation();
//        int expResult = 0;
//        int result = instance.getPersonNo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPersonNo method, of class Reservation.
//     */
//    @Test
//    public void testSetPersonNo() {
//        System.out.println("setPersonNo");
//        int personNo = 0;
//        Reservation instance = new Reservation();
//        instance.setPersonNo(personNo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getReservationNo method, of class Reservation.
//     */
    @Test
    public void testGetReservationNo() {
        System.out.println("getReservationNo");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.getReservationNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
//
//    /**
//     * Test of setReservationNo method, of class Reservation.
//     */
//    @Test
//    public void testSetReservationNo() {
//        System.out.println("setReservationNo");
//        int reservationNo = 0;
//        Reservation instance = new Reservation();
//        instance.setReservationNo(reservationNo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPaymentOption method, of class Reservation.
//     */
//    @Test
//    public void testGetPaymentOption() {
//        System.out.println("getPaymentOption");
//        Reservation instance = new Reservation();
//        String expResult = "";
//        String result = instance.getPaymentOption();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPaymentOption method, of class Reservation.
//     */
//    @Test
//    public void testSetPaymentOption() {
//        System.out.println("setPaymentOption");
//        String PaymentOption = "";
//        Reservation instance = new Reservation();
//        instance.setPaymentOption(PaymentOption);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of cancelReservation method, of class Reservation.
     */
//    @Test
//    public void testCancelReservation() {
//        System.out.println("cancelReservation");
//        int reservationNo = 1;
//        Reservation instance = new Reservation();
//        instance.cancelReservation(reservationNo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of displayReservation method, of class Reservation.
//     */
    @Test
    public void testDisplayReservation() {
        System.out.println("displayReservation");
        int reservationNo = 0;
        Reservation instance = new Reservation();
        instance.displayReservation(reservationNo);
   
//        assertNot;
    }

    /**
     * Test of modifyReservation method, of class Reservation.
     */
    @Test
    public void testModifyReservation() throws Exception {
        System.out.println("modifyReservation");
        int reservationNo = 2;
        Reservation instance = new Reservation();
        instance.modifyReservation(reservationNo);
         int result = instance.getReservationNo();
        assertEquals(2,result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDate method, of class Reservation.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Reservation instance = new Reservation();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDate method, of class Reservation.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Reservation instance = new Reservation();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTime method, of class Reservation.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTime method, of class Reservation.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int time = 0;
        Reservation instance = new Reservation();
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPersonNo method, of class Reservation.
     */
    @Test
    public void testGetPersonNo() {
        System.out.println("getPersonNo");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.getPersonNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPersonNo method, of class Reservation.
     */
    @Test
    public void testSetPersonNo() {
        System.out.println("setPersonNo");
        int personNo = 0;
        Reservation instance = new Reservation();
        instance.setPersonNo(personNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getReservationNo method, of class Reservation.
     */


    /**
     * Test of setReservationNo method, of class Reservation.
     */
    @Test
    public void testSetReservationNo() {
        System.out.println("setReservationNo");
        int reservationNo = 0;
        Reservation instance = new Reservation();
        instance.setReservationNo(reservationNo);
         int result = instance.getReservationNo();
        assertEquals(0,result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPaymentOption method, of class Reservation.
     */
    @Test
    public void testGetPaymentOption() {
        System.out.println("getPaymentOption");
        Reservation instance = new Reservation();
        String expResult = "credit card";
        String result = instance.getPaymentOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPaymentOption method, of class Reservation.
     */
    @Test
    public void testSetPaymentOption() {
        System.out.println("setPaymentOption");
        String PaymentOption = "credit card";
        Reservation instance = new Reservation();
        instance.setPaymentOption(PaymentOption);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of cancelReservation method, of class Reservation.
     */
    @Test
    public void testCancelReservation() {
        System.out.println("cancelReservation");
        int reservationNo = 1;
        Reservation instance = new Reservation();
        instance.cancelReservation(reservationNo);
        int result = instance.getReservationNo();
        assertEquals(0,result);

        // TODO review the generated test code and remove the default call to fail.

    }
    
}
