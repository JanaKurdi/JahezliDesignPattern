/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    public ArrayList<Reservation> reservations = new ArrayList<>();
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

      public void ReservationTable(String tableN) throws IOException {

        FileReader f = new FileReader("TableReserved.txt");
        BufferedReader br = new BufferedReader(f);

        FileWriter file = new FileWriter("TableReserved.txt");//To save to file you need to create a File object.
        PrintWriter writer = new PrintWriter(file);//Then you need a way to print to the file. You can use PrintWriter
        int Tables[] = new int[2];

        String line;
        while ((line = br.readLine()) != null) {
            String[] token = line.split(",");
            for (int i = 0; i < Tables.length; i++) {
                if (token[i].equals(tableN)) {
                    System.out.println("That table has already been reserved" + "Please select another one or try another time");

                } else {

                    System.out.println("That table reserved");
                    token[i] = tableN;
                    writer.println(tableN);

                }
            }
        }
        br.close();
        writer.close();
    }
      
    //check parameter and return values
    public String cancelReservation(int reservationNo) {
		for (int i = 0; i < reservations.size(); i++) {
			Reservation Temp = reservations.get(i);
			if (Temp.getReservationNo() == reservationNo) {

				reservations.remove(i);
				return Temp.getReservationNo() + " Your reservation has been cancelled successfully";
			}
		}

		return "This reservation is not Assigned to you";
	}

    public String displayReservation(int reservationNo) {
        Place placeName = null;
        paymentMethod total = null;
        String s = placeName.getPlaceName();
        System.out.println("Welcome");
        System.out.println("Your reservation number is: " + getReservationNo());
        System.out.println("Your reservation date is: " + getDate());
        System.out.println("Place name is: " + placeName.getPlaceName());
        System.out.println("Total amount is: " + total.getCost());
        System.out.println(" Enjoy. ");
        System.out.println();
return s;
    }

    public void modifyReservation(int reservationNo) throws ParseException {
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        Date date1 = new SimpleDateFormat("dd/mm/yyyy").parse(date);
        Place placeName = null;
        String placeName1 = input.nextLine();
        paymentMethod total = null;

        System.out.println("Your reservation number is: " + getReservationNo());
        System.out.println("Your reservation date is: ");setDate(date1);
        System.out.println("Place name is: " );placeName.setPlaceName(placeName1);
        System.out.println("The total cost is: " + total.getCost());
        System.out.println(" Your reservation has been modified successfully ");
        System.out.println();

    }
        public ArrayList<Reservation> getReservation(){
        return reservations;
    }
    
    public void setReservation(ArrayList<Reservation> reservations){
        this.reservations = reservations;
    }
}
