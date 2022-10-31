package jahezli.app;

import static jahezli.app.JahezliApp.Menus;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Customer implements User , Login {

    Scanner input = new Scanner(System.in);
    String phone;
    String city;
    String name;
    String password;
    Reservation reserve;
    private double totalPrice = 0;


    public Customer(){
        
    }

    public Customer(String phone, String city, String password, double totalPrice) throws FileNotFoundException {
    
    }

    public Customer(String name, String phone, String city, String password) throws FileNotFoundException {
        this.name = name;
//        super.setPassword(password);
//        super.setUserName(phone);
        this.city = city;
        this.totalPrice = totalPrice;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// here must be link with Reservation Idea
    public Reservation getReserve() {
        return reserve;
    }

    public void setReserve(Reservation reserve) {
        this.reserve = reserve;
    }
    //check method parameter and return

    public void reserve() {

    }
//////////////////////////////////////////
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = totalPrice;
    }
// here we have method that should be implemented
    @Override
    public String getPhoneNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPhoneNo(String phoneNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Access(String phoneNo, String password) {
        System.out.println("Welcome to Jahezli App !! ");
    }

}
