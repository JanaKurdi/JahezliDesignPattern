package jahezli.app;

import java.io.*;
import java.util.Scanner;

public class User {
    /// need to modify and complete the code
    String Phone;
    private String password;
    String userName;
    // to read account and to store Accounts
       // array to store the record of accounts
    String[][] Accounts = new String[30][];
    boolean loginStatus;
    // file of  Account record 
    File usersRecords = new File("C:\\Users\\DELL\\OneDrive\\المستندات\\NetBeansProjects\\CPIT-251-GROUP4-master\\UsersAccounts.txt\"");
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
    public boolean login(String Username, String Password) {
        boolean state = false;
        
        if (Username.equals(this.userName) && Password.equals(this.password)) {
            state = true;
        } else {

            state = false;

        }
        return state;
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

    public boolean newAccount(String Username, String password) throws FileNotFoundException, IOException {
        Boolean flag = true;
        File file1 = new File("Users.txt");

        Scanner input = new Scanner(file1);
        FileWriter output = new FileWriter(file1.getAbsoluteFile(), true);

        String command = "";

        while (input.hasNextLine()) {

            command = input.nextLine().trim();
            String[] arr = command.split(",");

            if (arr[0].equalsIgnoreCase(Username)) {
                flag = false;

            }

        }

        if (flag == true) {
            output.write("\n");
            output.write(Username + "," + password);
            output.close();
            input.close();
            return true;

        }
        output.close();
        input.close();
        return flag;

    }
        public boolean checkAccount(String Username, String pass) throws FileNotFoundException {

        File file1 = new File("Users.txt");

        Scanner input = new Scanner(file1);

        String command = "";

        while (input.hasNextLine()) {

            command = input.nextLine().trim();
            String[] arr = command.split(",");

            if ((arr[0].equalsIgnoreCase(Username)) && (arr[1].equalsIgnoreCase(pass))) {
                System.out.println(" correct ");
                return true;

            }

        }

        return false;

    }
}

