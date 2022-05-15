/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author mac
 */
/**
 *
 * @author mac
 */
public class User {
    /// need to modify and complete the code
    String Phone;
    private String password;
    // to read account and to store Accounts
       // array to store the record of accounts
    String[][] Accounts = new String[30][];
    boolean loginStatus;
    // file of  Account record 
    File usersRecords = new File("UsersAccounts.txt");
    Scanner input = new Scanner(usersRecords);

    public User() throws FileNotFoundException {

    }

    public String getUserName() {
        return Phone;
    }

    public void setUserName(String userName) {
        this.Phone = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
// this method not completed
    public boolean login() {
        boolean loginCheck = false;

//        if (login.checkPassword()) {
//            System.out.println("You are logged in!");
//        } else {
//            System.out.println("The username and password you entered are incorrect.");
//        }
        return loginCheck;
    }
// this method store account record 
    public void AccountsRecords() throws IOException {
          if (!usersRecords.exists()){
              System.out.println(" Account file is not exist");
          }
          else{
        while (input.hasNext()){
            for(int i =0;i<Accounts.length;i++){
                String [] line = input.nextLine().split(" ");
                for(int j=0; j< line.length;j++){
                    Accounts[i][j] = line[j];
                }
            }
        }
          }
        input.close();
    }

//    public boolean checkAccount(String phone ,String password) {
//        boolean check = false;
//
//        return check;
//    }
//    public boolean NewAccount (){
//        boolean Sucess = false;
//        
//        return Sucess;
//    }
}

