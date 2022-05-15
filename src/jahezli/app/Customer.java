/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.io.FileNotFoundException;

/**
 *
 * @author mac
 */
public class Customer extends User {
    String phone;
    String city;
    String password;
    Reservation reserve;
    public Customer() throws FileNotFoundException{
        super();
    }
public Customer(String phone, String city,String password) throws FileNotFoundException{
        super.setPassword(password);
        super.setUserName(phone);
        this.city = city;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Reservation getReserve() {
        return reserve;
    }

    public void setReserve(Reservation reserve) {
        this.reserve = reserve;
    }
     //check method parameter and return
     public void reserve(){
         
     }
    
}
