package jahezli.app;

import java.io.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import java.util.ArrayList;

import java.util.Scanner;

public class JahezliApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        // TODO code application logic here
        int userChoice = 0;

        Menus(1);
        userChoice = input.nextInt();
        switch (userChoice) {
            case 1://signup case
                System.out.println("");
                System.out.println("---------------------------------------------------");
                System.out.println("                        Signup                     ");
                System.out.println("---------------------------------------------------");
                //RegisterAccount(input); // YOU CAN USE THIS METHOD 
                break;
            case 2:
                System.out.println("");
                System.out.println("---------------------------------------------------");
                System.out.println("                        Login                     ");
                System.out.println("---------------------------------------------------");
                login(input);
                break;

            case 3://logout case
                System.out.println("---------------------------------------------------");
                System.out.println("*** Thank you for Visiting Jahezli app ***");
                System.out.println("---------------------------------------------------");
                System.exit(0);

            default:
                System.out.println("");
                System.out.println("***********You did not login ***********");
                break;

        }

    }
//

    public static void Menus(int selectMenu) {
        switch (selectMenu) {

            //main menue for home page
            case 1:
                System.out.println("---------------------------------------------------");
                System.out.println("        Welcome to Jahezli reservation app         ");
                System.out.println("---------------------------------------------------");
                System.out.println("Enter 1 to Signup");
                System.out.println("Enter 2 to Login");
                System.out.println("Enter 3 to exit");
                return;

            case 2:
                System.out.println("---------------------------------------------------");
                System.out.println("                   Manager menu                    ");
                System.out.println("---------------------------------------------------");
                System.out.println("Enter 1 to display all reservation");
                System.out.println("Enter 2 to log out");
                return;

            case 3:
                System.out.println("---------------------------------------------------");
                System.out.println("                   Customer menu                   ");
                System.out.println("---------------------------------------------------");
                System.out.println("Enter 1 to choose table ");
                System.out.println("Enter 2 to reserve a table  ");
                System.out.println("Enter 3 to display the reservation");
                System.out.println("Enter 4 to pay the amount ");
                System.out.println("Enter 5 to Logout");
                System.out.println("---------------------------------------------------");

            default:
                return;

        }

    }

    public static void login(Scanner input) throws FileNotFoundException {
        //  User user = new User();
        // log in ## not completed
        System.out.print("Enter your phone Number: ");
        String phone = input.next();
        System.out.print("Enter your password: ");
        String Password = input.next();
        if (phone.equals("0551234521")) {
            // Singletone Manager
        Manager manager = Manager.getManager();
            Menus(2);
            manager.Access(phone, Password);
            Menus(2);
            manager.Access(phone, Password);

        } else {
            Customer customer = new Customer();
            Reservation reservation = null;
            ShoppingCart cart = new ShoppingCart();
            customer.Access(phone, Password);
            while(true){
            Menus(3);
            int CutomerChoice = input.nextInt();
            switch (CutomerChoice) {
                case 1:
                    System.out.println("---------------------------------------------------");
                    System.out.println("                   Choose Table                    ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter 1 for VIP table ");
                    System.out.println("Enter 2 for Normal table  ");
                    int tableChoice = input.nextInt();
                    // table Factrey
                    if (tableChoice == 1) {
                        // VIP  
                    } else if (tableChoice == 2) {
                        // Normal
                    } else {
                        System.exit(0);
                    }
                    // choose table 
                    // tables
                    break;
                case 2:
                    System.out.println("---------------------------------------------------");
                    System.out.println("                   Reservation page                 ");
                    System.out.println("---------------------------------------------------");
                    ReservationBuilder con = new ConcreteBuilder();
                    ReservationEngineer reservEng = new ReservationEngineer(con);
                    reservEng.MakeReservation();
                    reservation = reservEng.getReservation();
                    cart.addReservation(reservation);
                    System.out.println("---------------------------------------------------");
                    System.out.println("You Reservation Done Successfully !!");
                    System.out.println("---------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------------");
                    System.out.println("          Display RESERVATION INFORMATION                 ");
                    System.out.println("---------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("reservation Number : "+reservation.getResvervationNum());
                    System.out.println("Date is:" + reservation.getReservationDate());
                    System.out.println("Time is:" + reservation.getReservationTime());
                    System.out.println("Place name is:" + reservation.getReservationPlace());
                    System.out.println("Table number is:" + reservation.getReservationTable());
                    System.out.println("Price is: "+reservation.getPrice());
                    break;
                case 4:
                    // Strategy
                    cart.makePayment();
                    break;
                case 5:
                    System.out.println("---------------------------------------------------");
                    System.out.println("*** Thank you for Visiting Jahezli app ***");
                    System.out.println("---------------------------------------------------");
                    System.exit(0);
                    break;

                default:
                    System.out.println();
                    System.out.println("Wrong entry please try again:");
                    System.out.println("---------------------------------------------------");
                    System.out.println("");

            }
            }
        }
    }

/// this method for registration @ abeer
    public static void RegisterAccount(Scanner input) throws FileNotFoundException {
        String phone;
        String city = null;
        String password;
        ArrayList<User> usersArray = new ArrayList();
        // registration 
        System.out.println("---------------------------------------------------");
        System.out.println("                 Registration Page                 ");
        System.out.println("---------------------------------------------------");
        String name;
        System.out.println("Enter your full name :");
        name = input.next();
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
        }
        /// insert the custmer method not completed
        // here i create an object of customer
        //String phone, String city,String password
        Customer customer = new Customer(name, phone, city, password);
        usersArray.add(customer);
        System.out.println("thank you!" + customer.getName());
        System.out.println("Account Created Successfully!");

    }


}
//>>>>>>> origin/master
