/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;


import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class JahezliApp {

    /**
     * @param args the command line arguments
     */
    // arraylist to store customers after registration 
    ///static ArrayList<Customer> arrayOfCustomers = new ArrayList<>();
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int choice;
        int reservationNo;
        int choice2;
        Reservation reservation = null;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("             Welcome to Jahezli reservation app   ");
            System.out.println("---------------------------------------------------");
            System.out.println("Enter 1 to login");
            System.out.println("Enter 2 to search for Place ");
            System.out.println("Enter 3 to modify the reservation ");
            System.out.println("Enter 4 to display the reservation ");
            System.out.println("Enter 5 to review and feedback ");
            System.out.print("Enter 0 to quit Enter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    if (choice == 0) {
                        System.out.println("---------------------------------------------------");
                        System.out.println("*** Thank you for Visiting ***");
                        System.out.println("---------------------------------------------------");
                        System.exit(0);

                    } else {
                        System.out.println("***********You did not login ***********");
                    }
                    break;

                case 1:
                    //  // Log in and registration 
                    System.out.println("---------------------------------------------------");
                    System.out.println("                Jahezli reservation                ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("if you have a account Enter 1:");
                    System.out.println("if you don't have an account Enter 2:");
                    choice2 = input.nextInt();
                    if (choice2 == 1) {
                        //this method below not completed 
                        boolean loginSatute = login(input);
                    } else {
                        // registration 
                        // reading infomation done sucessfully but I didn't insert user into the arrayList
                        RegisterAccount(input);
                    }
                    break;


                case 2:
                    if (choice == 2) {

                    } else {
                        System.out.println("***********You have to login first***********");
                    }
                    break;

                case 3:
                    if (choice == 3) {
                        System.out.print("Enter your reservation number: ");
                        reservationNo = input.nextInt();
                        reservation.modifyReservation(reservationNo);
                    } else {
                        System.out.println("***********You have to login first***********");
                    }
                    break;

                case 4:
                    if (choice == 4) {
                        System.out.print("Enter your reservation number: ");
                        reservationNo = input.nextInt();
                        reservation.displayReservation(reservationNo);

                    } else {
                        System.out.println("***********You have to login first***********");
                    }
                    break;

                case 5:
                    if (choice == 5) {
                        System.out.println("Enter 1 to write your feedback: ");
                        System.out.println("Enter 2 to review the feedbacks: ");
                        System.out.print("Enter your choice: ");

                        int feedbackChoice = input.nextInt();
                        switch (feedbackChoice) {
                            case 1:
                                System.out.print("Enter your reservation number: ");
                                reservationNo = input.nextInt();
                                System.out.print("Enter your feedback: ");
                                String feedback = input.next();
                                break;

                            case 2:
                                System.out.print("Enter the restaurant name: ");
                                String resturauntName = input.next();

                                break;
                        }
                    } else {
                        System.out.println("***********You have to login first***********");
                    }

                    break;
                default:
                    System.out.println("*********** Wrong entry try again ***********");
                    break;
            }

        } while (choice != 0);

    }
        /// this method for registration 
    public static void RegisterAccount(Scanner input) throws FileNotFoundException {
        String phone;
        String city;
        String password;
        // registration 
        System.out.println("---------------------------------------------------");
        System.out.println("                 Registration Page                 ");
        System.out.println("---------------------------------------------------");
        /// this while need to be checked if it is work correctly
        // Phone Number
        while (true) {
            // take phone and check if it correct
            System.out.println("Enter Phone Number Starting with 05:");
            phone = input.next();
            if (phone.length() == 10 && phone.startsWith("05")) {
                System.out.println("Phone number is correct ");
                break;
            }
        }
        // password i didn't put any conditions on the password
        System.out.println("Enter password:");
        password = input.next();
        // CITY 
        //this is a menu so user select city 
        System.out.println("---------------------------------------------------");
        System.out.println("                 Select your City:                 ");
        System.out.println("---------------------------------------------------");
        System.out.println("Jeddah Enter 1");
        System.out.println("Mecca Enter 2");
        System.out.println("Riyadh Enter 3");
        System.out.println("Dammam Enter 4");
        city = input.next();
        //check if it right 
        while (true) {
            if (city.equals("1") || city.equals("2") || city.equals("3") || city.equals("4")) {
                break;
            } else {
                System.out.println("---------------------------------------------------");
                System.out.println("                 Select your City:                 ");
                System.out.println("---------------------------------------------------");
                System.out.println("Jeddah Enter 1");
                System.out.println("Mecca Enter 2");
                System.out.println("Riyadh Enter 3");
                System.out.println("Dammam Enter 4");
                city = input.next();
            }
        }
        // accroding to selection add the name of the city
        switch (city) {
            case "1":
                city = "Jeddah";
                break;
            case "2":
                city = "Mecca";
                break;
            case "3":
                city = "Riyadh";
                break;
            case "4":
                city = "Dammam";
                break;
        }
        /// insert the custmer method not completed
        // here i create an object of customer
        //String phone, String city,String password
        Customer customer = new Customer(phone, city, password);
        System.out.println(customer.getCity());
        // AddCustomer(customer);

    }

// this method takes login info 
    // not completed
    // we  need method to check the login info
    public static boolean login(Scanner input) {
        boolean login_statue = false;
        // log in ## not completed 
        System.out.print("Enter your user name: ");
        String userName = input.next();
        System.out.print("Enter your password: ");
        String Password = input.next();
        return login_statue;
    }

//    private static void AddCustomer(Customer customer) throws FileNotFoundException {
//        
//    }

}
