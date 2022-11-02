package jahezli.app;

import java.util.Scanner;
/**
 *
 * @author abeer
 */
public class Login implements Profile{

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
