package jahezli.app;

import java.util.Date;

/**
 *
 * @author Razan Alshaikh
 */
public class CreditCard implements PaymentMethod {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit/debit card");
    }

}
