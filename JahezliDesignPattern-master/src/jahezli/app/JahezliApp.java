package jahezli.app;

import java.io.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
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
                RegisterAccount(input);
                break;
            case 2://login case
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
        //  Facade dp
        System.out.println("Choose 1 for Manager menu, and 2 for Customer menu");
        int Choose = input.nextInt();
        Registration register = new Registration();
        System.out.println("Please Sign in to your Account");
        register.AccessAcc();

        if (Choose == 1) {
            // Singletone Manager
            Manager manager = Manager.getManager();
            Menus(2);
            manager.Access();


        } else if (Choose == 2) {
            Customer customer = new Customer();
            Reservation reservation = null;
            ShoppingCart cart = new ShoppingCart();
            //customer.Access(phone, Password);
            Menus(2);
            customer.Username();
            customer.Password();
            customer.PhoneNo();
            customer.Email();

            while (true) {
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
                    // table Factroy
                    switch (tableChoice) {
                        case 1:
                            Table VIPTable = TableFactory.getTable("VIPTable");
                            VIPTable.TableType();
                            break;
                        case 2:
                            Table NormalTable = TableFactory.getTable("NormalTable");
                            NormalTable.TableType();
                            break;
                        default:
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
                        System.out.println("Reservation Number : " + reservation.getResvervationNum());
                        System.out.println("Date is:" + reservation.getReservationDate());
                        System.out.println("Time is:" + reservation.getReservationTime());
                        System.out.println("Place name is:" + reservation.getReservationPlace());
                        System.out.println("Table number is:" + reservation.getReservationTable());
                        System.out.println("Price is: " + reservation.getPrice());
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
        //  Facade dp
        Registration register = new Registration();
        System.out.println("\nYou Can Create your own Account\n");
        register.CreateAcc();

    }
}