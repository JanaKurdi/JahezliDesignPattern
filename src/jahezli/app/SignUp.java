package jahezli.app;
/**
 *
 * @author abeer
 */
import java.util.Scanner;

public class Signup implements Profile {

    Scanner input = new Scanner(System.in);

    @Override
    public void name() {
        System.out.println("Enter your full name :");
        String name = input.next();
    }

    @Override
    public void Username() {

        String username = "";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your username \n'ex: Abeer11$ or AbeerAbdullah$' with no more than 6 digits: ");
            username = scanner.next();
            if (username.contains("$") && username.length() == 6) {
                break;
            } else {
                System.out.println("The username is mismatch. Try again, \nmust conatain special charhater with no more than 6 digits\n");
            }
        }
    }

    @Override
    public void Password() {

        String password = "";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter password: \nno more than 10 digits ");
            password = scanner.next();
            if (password.charAt(0) == 'A' && password.contains("beer") && password.contains("@") && password.contains("123654") && password.length() == 12) {
                break;
            } else {
                System.out.println("The password is mismatch. Try again, \nmust conatain Upper and Lower Case and special charhater with no more than 10 digits");
            }
        }
    }

    @Override
    public void PhoneNo() {

        String Phone = "";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter phone number ex: 05XXXXXXXX: ");
            Phone = scanner.next();
            if (Phone.charAt(0) == '0' && Phone.charAt(1) == '5' && Phone.length() == 10) {
                break;
            } else {
                System.out.println("The phone is incorrect,try again, , it starts with 05 and contains 10 Digits");
            }
        }
    }

    @Override
    public void Email() {
        String Email = "";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your email  ex:Abeer@*****.com : ");
            Email = scanner.next();
            if (Email.contains("@") && Email.contains(".com")) {
                break;
            } else {
                System.out.println("The Email is incorrect, Try again, must conatain @ and .com");
            }
        }
    }

    @Override
    public void City(Scanner input) {

        String city = "";

        if (city.equals("1") || city.equals("2") || city.equals("3") || city.equals("4")) {
            System.out.println("---------------------------------------------------");
            System.out.println("                 Select your City:                 ");
            System.out.println("---------------------------------------------------");
            System.out.println("Jeddah Enter 1");
            System.out.println("Mecca Enter 2");
            System.out.println("Riyadh Enter 3");
            System.out.println("Dammam Enter 4");

            city = input.next();
        }
    }
}
