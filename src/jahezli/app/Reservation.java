/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.util.Date;

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
    
   public Reservation(int personNo,Date date,int time) {
       this.personNo=personNo;
       this.date=date;
       this.time=time;        
       
   }
   
   //check parameter and return values
   public void cancelReservation(int reservationNo){
       
   }
   public void displayReservation(int reservationNo){
       
   }
   public void modifyReservation(int reservationNo){
       
   }
   
}
