/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.io.FileNotFoundException;
import java.io.IOException;
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
public class UserTest {

    public UserTest() {
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
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName() throws FileNotFoundException {
        System.out.println("getUserName");
        User instance = new User();
        String expResult = "0549226961";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test
    public void testSetUserName() throws FileNotFoundException {
        System.out.println("setUserName");
        String userName = "0503663001";
        User instance = new User();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() throws FileNotFoundException {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "Aa11";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() throws FileNotFoundException {
        System.out.println("setPassword");
        String password = "Am11";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLoginStatus method, of class User.
     */
    @Test
    public void testIsLoginStatus() throws FileNotFoundException {
        System.out.println("isLoginStatus");
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.isLoginStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginStatus method, of class User.
     */
    @Test
    public void testSetLoginStatus() throws FileNotFoundException {
        System.out.println("setLoginStatus");
        boolean loginStatus = true;
        User instance = new User();
        instance.setLoginStatus(loginStatus);
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class User.
     */
    @Test
    public void testLogin() throws FileNotFoundException, IOException {
        System.out.println("login");
        String Username = "0549226961";
        String password = "Aa11";
        User instance = new User();
       boolean result= instance.newAccount(Username, password);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of AccountsRecords method, of class User.
     */
    @Test
    public void testAccountsRecords() throws Exception {
        System.out.println("AccountsRecords");
        User instance = new User();
        instance.AccountsRecords();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newAccount method, of class User.
     */
    @Test
    public void testNewAccount() throws Exception {
        System.out.println("newAccount");
        String Username = "0541212803";
        String password = "aa11";
        User instance = new User();
       boolean result= instance.newAccount(Username, password);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAccount method, of class User.
     */
    @Test
    public void testCheckAccount() throws Exception {
        System.out.println("checkAccount");
        String Username = "0549226961";
        String pass = "Aa11";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.checkAccount(Username, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
