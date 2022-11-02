package jahezli.app;
/**
 *
 * @author abeer
 */
import static jahezli.app.JahezliApp.input;

public class Registration {
    
    private Profile login;
    private Profile signup;
    
    public Registration(){
        login = new Login();
        signup = new Signup();
    }
    public void CreateAcc(){
        System.out.println("---------------------------------------------------");
        System.out.println("                 Registration Page                 ");
        System.out.println("---------------------------------------------------\n");
        signup.name();
        signup.Username();
        signup.Password();
        signup.PhoneNo();
        signup.Email();
        signup.City(input);
        System.out.println("Account Created Successfully!");
        
    }
    
    public void AccessAcc(){
        login.Username();
        login.Password();
    }
}
