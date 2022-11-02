package jahezli.app;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Customer implements User , Profile {

    Scanner input = new Scanner(System.in);
    String phone;
    String city;
    String name;
    String password;
    Reservation reserve;


    public Customer(){  
    }

    public Customer(String phone, String city, String password, double totalPrice) throws FileNotFoundException {
    }

    public Customer(String name, String phone, String city, String password) throws FileNotFoundException {
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.password = password;
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

    public Reservation getReserve() {
        return reserve;
    }

    public void setReserve(Reservation reserve) {
        this.reserve = reserve;
    }
    //check method parameter and return

    public void reserve() {

    }
////////////////////////////////////
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
    }

    @Override
    public void setPassword(String password) {
    }

    @Override
    public void addUser(User user) {
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
