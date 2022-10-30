/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.io.FileNotFoundException;
import java.util.ArrayList;
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
public class PlaceTest {
    
    public PlaceTest() {
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
     * Test of getPlace method, of class Place.
     */
    @Test
    public void testGetPlace() throws FileNotFoundException {
        System.out.println("getPlace");
        Place instance = new Place();
        ArrayList<Table> expResult = null;
        ArrayList<Table> result = instance.getPlace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of displayPlaces method, of class Place.
     */
    @Test
    public void testDisplayPlaces() throws FileNotFoundException {
        System.out.println("displayPlaces");
        Place instance = new Place();
        instance.displayPlaces();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPlaceName method, of class Place.
     */
    @Test
    public void testGetPlaceName() throws FileNotFoundException {
        System.out.println("getPlaceName");
        Place instance = new Place();
        String expResult = "";
        String result = instance.getPlaceName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPlaceName method, of class Place.
     */
    @Test
    public void testSetPlaceName() throws FileNotFoundException {
        System.out.println("setPlaceName");
        String placeName = "";
        Place instance = new Place();
        instance.setPlaceName(placeName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPlaceNo method, of class Place.
     */
    @Test
    public void testGetPlaceNo() throws FileNotFoundException {
        System.out.println("getPlaceNo");
        Place instance = new Place();
        int expResult = 0;
        int result = instance.getPlaceNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPlaceNo method, of class Place.
     */
    @Test
    public void testSetPlaceNo() throws FileNotFoundException {
        System.out.println("setPlaceNo");
        int placeNo = 0;
        Place instance = new Place();
        instance.setPlaceNo(placeNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAddress method, of class Place.
     */
    @Test
    public void testGetAddress() throws FileNotFoundException {
        System.out.println("getAddress");
        Place instance = new Place();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAddress method, of class Place.
     */
    @Test
    public void testSetAddress() throws FileNotFoundException {
        System.out.println("setAddress");
        String address = "";
        Place instance = new Place();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPhoneNo method, of class Place.
     */
    @Test
    public void testGetPhoneNo() throws FileNotFoundException {
        System.out.println("getPhoneNo");
        Place instance = new Place();
        String expResult = "";
        String result = instance.getPhoneNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPhoneNo method, of class Place.
     */
    @Test
    public void testSetPhoneNo() throws FileNotFoundException {
        System.out.println("setPhoneNo");
        String phoneNo = "";
        Place instance = new Place();
        instance.setPhoneNo(phoneNo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTableArray method, of class Place.
     */
    @Test
    public void testGetTableArray() throws FileNotFoundException {
        System.out.println("getTableArray");
        Place instance = new Place();
        Table[] expResult = null;
        Table[] result = instance.getTableArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTableArray method, of class Place.
     */
    @Test
    public void testSetTableArray() throws FileNotFoundException {
        System.out.println("setTableArray");
        Table[] tableArray = null;
        Place instance = new Place();
        instance.setTableArray(tableArray);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of searchPlace method, of class Place.
     */
    @Test
    public void testSearchPlace() throws FileNotFoundException {
        System.out.println("searchPlace");
        int info = 0;
        Place instance = new Place();
        int expResult = 0;
        int result = instance.searchPlace(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
