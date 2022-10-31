package jahezli.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager implements User, Login {

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

    public static void setReservationArray(ArrayList<Reservation> reservationArray) {
        Manager.reservationArray = reservationArray;
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

    @Override
    public void Access(String phoneNo, String password) {
        Scanner input = new Scanner(System.in);
        int managerChoice = input.nextInt();
           switch (managerChoice) {
            case 1:
                System.out.println("---------------------------------------------------");
                System.out.println("                Display all reservation            ");
                System.out.println("---------------------------------------------------");
                System.out.println("No reservation done");
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

}
