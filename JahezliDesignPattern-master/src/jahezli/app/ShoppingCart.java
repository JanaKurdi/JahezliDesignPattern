package jahezli.app;

/**
 *
 * @author Razan Alshaikh
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    Scanner input = new Scanner(System.in);
    //List of Resvervation
    private List<Reservation> Reserve;

    public ShoppingCart() {
        this.Reserve = new ArrayList<Reservation>();
    }

    public void addReservation(Reservation rev) {
        this.Reserve.add(rev);
    }

    public void removeReservation(Reservation rev) {
        this.Reserve.remove(rev);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Reservation rev : Reserve) {
            sum += rev.getPrice();
        }
        return sum;
    }

    public void pay(PaymentMethod paymentMethod) {
        double amount = calculateTotal();
        paymentMethod.pay(amount);
    }

    public void makePayment() {
        double total = calculateTotal();
        while (true) {
            System.out.println("Please choose PaymentMethod method you prefer :");
            System.out.println(" ********************************************** ");
            System.out.println("1.PayPal");
            System.out.println("2.CREDIT CARD");
            System.out.println(" ********************************************** ");
            int choosenNumberForPymmentMethod = input.nextInt();
            switch (choosenNumberForPymmentMethod) {
                case 1:
                    String email,
                     password;
                    System.out.println("\t\tPay by PayPal");
                    System.out.println(" ********************************************** ");
                    System.out.println("Enter your Email");
                    email = input.next();
                    email = Checker.checkEmail(email, input);
                    System.out.println("Enter your password");
                    password = input.next();
                    password = Checker.checkPassword(password, input);
                    pay(new PayPal(email, password));
                    break; 
                case 2:
                    String cardNum,
                     cardExpirationDate, CVV;
                    System.out.println("\t\tPay by credit card");
                    System.out.println(" ********************************************** ");
                    System.out.println("Please enter the credit card information :");
                    System.out.print("A credit card number must have between 13 and 19 digits): \nIt must start with:\n"
                            + "4 for Visa cards\n"
                            + "5 for Master cards\n"
                            + "37 for American Express cards\n"
                            + "6 for Discover cards\n\nCard number : ");
                    cardNum = input.next();
                    while (!Checker.isValidCardNumber(cardNum)) {
                        System.out.println("Invalid Card number ,please enter a valid Card number again :");
                        cardNum = input.next();
                    }
                    System.out.println("Card Holder Name:");
                    Scanner sc = new Scanner(System.in);
                    String Name = sc.nextLine();
                    Name = Checker.checkCardHolderName(Name, sc);
                    System.out.print("Card expiration date in MM/YY format : ");
                    cardExpirationDate = input.next();
                    while (!Checker.isValidExpiryDate(cardExpirationDate)) {
                        System.out.println("Invalid expiration date ,please enter a valid expiration date again :");
                        cardExpirationDate = input.next();
                    }
                    System.out.print("CVV (It should be 3 or 4 digits): ");
                    CVV = input.next();
                    while (!Checker.isValidCVVNumber(CVV)) {
                        System.out.println("Invalid CVV ,please enter a valid CVV again :");
                        CVV = input.next();
                    }
                    pay(new CreditCard(Name, cardNum, CVV, cardExpirationDate));
                    break;
                default:
                    System.out.println("incorrect vaule!");
                    System.out.println("please Try Again!!!");
                    break;

            }
            break;
        }
    }
}
