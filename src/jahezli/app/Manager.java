/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

/**
 *
 * @author mac
 */
public class Manager extends User{
    String placeName;
    
    public Manager(){
    super();
}

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    
    public String confirmReservation(int reservationNo){
        return null;
    }
    
     public String cancelReservation(int reservationNo){
        return null;
    }
}
