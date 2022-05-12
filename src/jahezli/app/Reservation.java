/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Reservation {

    Date date;
    int time;
    int personNo;
    int reservationNo;
    String PaymentOption;

    public Reservation() {

    }

    public Reservation(int personNo, Date date, int time) {
        this.personNo = personNo;
        this.date = date;
        this.time = time;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPersonNo() {
        return personNo;
    }

    public void setPersonNo(int personNo) {
        this.personNo = personNo;
    }

    public int getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo(int reservationNo) {
        this.reservationNo = reservationNo;
    }

    public String getPaymentOption() {
        return PaymentOption;
    }

    public void setPaymentOption(String PaymentOption) {
        this.PaymentOption = PaymentOption;
    }

    //check parameter and return values
    public void cancelReservation(int reservationNo) {
     System.out.println("  Your reservation has been cancelled successfully ");
    }

    public void displayReservation(int reservationNo) {
        Place placeName = null;
        paymentMethod total = null;
        
        System.out.println("Welcome");
        System.out.println("Your reservation number is: " + getReservationNo());
        System.out.println("Your reservation date is: " + getDate());
        System.out.println("Place name is: " + placeName.getPlaceName());
        System.out.println("Total amount is: " + total.getCost());
        System.out.println(" Enjoy. ");
        System.out.println();

    }

    public void modifyReservation(int reservationNo) throws ParseException {
        Scanner input = new Scanner(System.in);
        String date=input.nextLine();
        Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(date);
        Place placeName = null;
        String placeName1=input.nextLine();
        paymentMethod total = null;
        
        System.out.println("Your reservation number is: " + getReservationNo());
        System.out.println("Your reservation date is: ");setDate(date1);
        System.out.println("Place name is: " );placeName.setPlaceName(placeName1);
        System.out.println(" Your reservation has been modified successfully ");
        System.out.println();

    }

}
