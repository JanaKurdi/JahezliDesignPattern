package jahezli.app;

import jahezli.app.Customer;
import java.io.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
// Razan Alshaikh
public class JahezliApp {
 
    // arraylist to store customers after registration 
    static ArrayList<Customer> arrayOfCustomers = new ArrayList<>();
    static boolean customersatute;
    static Customer customer;

    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int choice;
        int reservationNo;
        String TableNo;
        int choice2;

        Reservation reservation = null;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("             Welcome to Jahezli reservation app   ");
            System.out.println("---------------------------------------------------");
            System.out.println("Enter 1 to login");
            System.out.println("Enter 2 to search for Place ");
            System.out.println("Enter 3 to reserve a table  ");
            System.out.println("Enter 4 to modify the reservation ");
            System.out.println("Enter 5 to display the reservation ");
            System.out.println("Enter 6 to pay the amount ");
            System.out.println("Enter 7 to review and feedback ");
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
                        login(input);

                    } else {
                        // registration 
                        // reading infomation done sucessfully but I didn't insert user into the arrayList
                        RegisterAccount(input);
                    }
                    break;

                case 2:
                    if (customersatute) {
//                        searchPlaces();
                        System.out.print("Please enter the place name: ");
                        String placeName = input.nextLine();
                        getReviews(placeName);
                        printFeedback(placeName);

                    } else {
                        System.out.println("***********You have to login first***********");
                    }
                    break;
                case 3:
                    if (choice == 3) {
                        System.out.print("Enter a table number to reserve: ");
                        TableNo = input.next();
                        reservation.ReservationTable(TableNo);
                        Table();
                    } else {
                        System.out.println("***********You have to login first***********");
                    }
                    break;
                case 4:
                    if (choice == 4) {
                        System.out.print("Enter your reservation number: ");
                        reservationNo = input.nextInt();
                        reservation.modifyReservation(reservationNo);
                    } else {
                        System.out.println("***********You have to login first***********");
                    }
                    break;

                case 5:
                    if (choice == 5) {
                        System.out.print("Enter your reservation number: ");
                        reservationNo = input.nextInt();
                        reservation.displayReservation(reservationNo);

                    } else {
                        System.out.println("***********You have to login first***********");
                    }
                    break;

                case 6:
                    System.out.println("Please choose the pament method you prefer :");
                    System.out.println(" ********************************************** ");
                    System.out.println("1.CASH");
                    System.out.println("2.CREDIT CARD");
                    System.out.println(" ********************************************** ");
                    int choosenNumberForPymmentMethod = input.nextInt();
                    System.out.println(customer.makePayment().PaymentDetails());

                    break;

                case 7:
                    if (choice == 7) {
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
        arrayOfCustomers.add(customer);
        System.out.println("thank you!" + customer.getName());
        System.out.println("Account Created Successfully!");

    }

// this method takes login info 
    public static boolean login(Scanner input) throws FileNotFoundException {
        User user = new User();
        // log in ## not completed 
        System.out.print("Enter your user name: ");
        String userName = input.next();
        System.out.print("Enter your password: ");
        String Password = input.next();
        boolean login_statue = user.login(userName, Password);
        if (login_statue = true) {
            System.out.println("WELCOME TO JahezliApp! ");
            customersatute = true;
//
        } else {
            System.out.println("incorrect password or username");
        }
        return login_statue;
    }

    public static void Table() throws FileNotFoundException {

        Scanner input = new Scanner(new File("Tables.txt"));
        while (input.hasNext()) {
            Table table = new Table(input.nextInt(), input.next(), input.nextInt());
            int numoftables = input.nextInt();
            for (int i = 0; i < numoftables; i++) {
                table.setTableNo(i);
            } //table.setTableNo(table);
        }
        input.close();
    }

    public static void getReviews(String placeName) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\اسامه بايونس\\Desktop\\Reviews.txt");
        if (!inputFile.exists()) {
            System.out.println("Input files does not exist !!");
            System.exit(0);
        }
        Scanner input = new Scanner(inputFile);
        String currPlaceName = "";
        String review = "";
        String temp1 = "";
        String temp2 = "";
        boolean notFound = true;
        int placeCounter = 0;
        ArrayList<String> reviews = new ArrayList<>();
        while (input.hasNext()) {
            temp1 = input.next();
            if (!temp1.equals("Place_Name:")) {
                continue;
            }
            currPlaceName = input.nextLine().trim();
            if (currPlaceName.equals(placeName)) {
                temp2 = input.next();
                if (!temp2.equals("Review:")) {
                    continue;
                }
                review = input.nextLine().trim();
                reviews.add(review);
                notFound = false;
                placeCounter++;
            }

        }
        System.out.println();
        if (notFound) {
            System.out.println("Not found any place with the required name \"" + placeName + "\"\n");
        } else {
            if (placeCounter == 1) {
                System.out.println("There is 1 review found for the place \"" + placeName + "\":\n");
            } else {
                System.out.println("There are " + placeCounter + " reviews found for the place \"" + placeName + "\":\n");
            }
            for (int i = 0; i < placeCounter; i++) {
                System.out.println("Review " + (i + 1) + ": " + reviews.get(i));
            }
            System.out.println();
        }
    }

    public static void printFeedback(String placeName) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);

        File outputFile = new File("C:\\Users\\اسامه بايونس\\Desktop\\Feedback.txt");
        PrintWriter output = new PrintWriter(outputFile);

        System.out.print("Enter your feedback about the place \"" + placeName + "\":");
        String feedback = in.nextLine();

        output.println(feedback);
        output.flush();

    }

//    public static void searchPlaces() throws FileNotFoundException {
//        Place p = new Place();
//        p.displayPlaces();
//    }

}
