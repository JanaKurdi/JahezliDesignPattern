package jahezli.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager implements User, Profile {

    private static Manager manager = null;
    private static String phoneNo;
    private static String password;
    public static String placeName;
    static ArrayList<User> usersArray = new ArrayList();
    static ArrayList<Reservation> reservationArray = new ArrayList();
    public static String reservationTime = null;
    public static String reservationDate = null;
    public static String price = null;

    private Manager() {
    }

    private Manager(String phoneNum, String password) {

    }

    public static Manager getManager() {
        if (manager == null) {
            phoneNo = "0551234521";
            password = "manager123";
            manager = new Manager(phoneNo, password);
        }
        return manager;
    }

    public static ArrayList<User> getUsersArray() {
        return usersArray;
    }

    @Override
    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void addUser(User user) {
        usersArray.add(user);
    }

    @Override
    public void setPhoneNo(String phoneNo) {
        Manager.phoneNo = phoneNo;
    }

    @Override
    public void setPassword(String password) {
        Manager.password = password;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public static ArrayList<Reservation> getReservationArray() {
        return reservationArray;
    }

    public static void setReservationArray(ArrayList<Reservation> Resrvation) {
        Manager.reservationArray = Resrvation;
    }

    public void addReservation(Reservation Reservation, int i) {
        reservationArray.add(i, Reservation);
    }

    public void DisplayAllResrvation() {
        for (int i = 0; i < reservationArray.size(); i++) {
            System.out.println("---------------------------------------------------");
            System.out.println("        Display ALL RESERVATION INFORMATION                 ");
            System.out.println("---------------------------------------------------");
            System.out.println("Reservation Number : " + reservationArray.get(i).getResvervationNum());
            System.out.println("Date is:" + reservationArray.get(i).getReservationDate());
            System.out.println("Time is:" + reservationArray.get(i).getReservationTime());
            System.out.println("Place name is:" + reservationArray.get(i).getReservationPlace());
            System.out.println("Table number is:" + reservationArray.get(i).getReservationTable());
            System.out.println("Price is: " + reservationArray.get(i).getPrice());
            System.out.println("Customer Number is: " + reservationArray.get(i).getCustomerNumber());
        }
    }

    public static String getReservationTime() {
        return reservationTime;
    }

    public static void setReservationTime(String reservationTime) {
        Manager.reservationTime = reservationTime;
    }

    public static String getReservationDate() {
        return reservationDate;
    }

    public static void setReservationDate(String reservationDate) {
        Manager.reservationDate = reservationDate;
    }

    public static String getPrice() {
        return price;
    }

    public static void setPrice(String price) {
        Manager.price = price;
    }

    public static User CheckUserexistence(String phoneNo) {
        for (int i = 0; i < usersArray.size(); i++) {
            User checker = usersArray.get(i);
            if (phoneNo.equals(checker.getPhoneNo())) {
                return checker;
            }
        }
        return null;
    }

    public void Access() {
        Scanner input = new Scanner(System.in);
        int managerChoice = input.nextInt();
        switch (managerChoice) {
            case 1:
                System.out.println("---------------------------------------------------");
                System.out.println("                Display all reservation            ");
                System.out.println("---------------------------------------------------");
                if (reservationArray.size() == 0) {
                    System.out.println("No resrvation done yet");
                } else {
                    DisplayAllResrvation();

                }
                System.out.println("---------------------------------------------------");
                System.out.println("");
                break;

            case 2:
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

    @Override
    public void Username() {
    }

    @Override
    public void Password() {
    }

    @Override
    public void PhoneNo() {
    }

    @Override
    public void Email() {
    }

    @Override
    public void City(Scanner input) {
    }

    @Override
    public void name() {
    }

}
