package jahezli.app;

/**
 *
 * @author Razan Alshaikh
 */
public class PayPal implements PaymentMethod {

    private String email;
    private String password;

    public PayPal(String email, String pass) {
        this.email = email;
        this.password = pass;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}
