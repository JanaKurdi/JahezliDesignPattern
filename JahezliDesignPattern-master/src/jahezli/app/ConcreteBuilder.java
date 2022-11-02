package jahezli.app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author renad
 */
public class ConcreteBuilder implements ReservationBuilder {

    Scanner input = new Scanner(System.in);
    private Reservation reservation;

    public ConcreteBuilder() {
        this.reservation = new Reservation();
    }

    @Override
    public void buildReservationDate() {
        System.out.println("Enter the Date you want: ");
        String date = input.next();
        do {
            if (IsValidDate(date)) {
                break;
            } else {
                System.out.println("invalid input,date must be in correct format like(dd/MM/yyyy) please try again :");
                date = input.next();
            }
        } while (true);
        reservation.setReservationDate(date);

    }

    @Override
    public void buildReservationTime() {
        System.out.println("Enter time you want:");
        String time = input.next();
        do {
            if (IsValidInput(time)) {
                break;
            } else {
                System.out.println("invalid input, time must be number please try again :");
                time = input.next();
            }
        } while (true);
        reservation.setReservationTime(time);
    }

    @Override
    public void buildReservationPlace() {
        System.out.println("Enter place name you want:");
        String place = input.next();
        do {
            if (!IsString(place)) {
                System.out.println("invalid input, Place must be String please try again :");
                place = input.next();
            } else {
                break;
            }
        } while (true);
        reservation.setReservationPlace(place);
    }

    @Override
    public void buildReservationTable() {
        System.out.println("Enter table number you want:");
        String table = input.next();
        do {
            if (IsValidInput(table)) {
                break;
            } else {
                System.out.println("invalid input, Table must be number please try again :");
                table = input.next();
            }
        } while (true);
        reservation.setReservationTable(table);
    }

    @Override
    public Reservation getReservation() {
        return this.reservation;
    }

//*******************checking methods*******************
    public static boolean IsValidDate(String d) {
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date BD = null;
        date.setLenient(false);
        try {
            BD = date.parse(d);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }

    public static boolean IsString(String st) {
        try {
            Integer.parseInt(st);
            return false;

        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static boolean IsValidInput(String s) {
        try {
            int number = Integer.parseInt(s);
            if (number > 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String buildReservationNumber() {
        String Rev1 = "1200";
        reservation.setResvervationNum(Rev1);
       return Rev1;
    }

    @Override
    public double buildReservationPrice() {
        double price = 20;
        reservation.setPrice(price);
        return price;
    }
}
