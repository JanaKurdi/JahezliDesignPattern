package jahezli.app;

import java.util.*;

public class paymentMethod {
    Reservation resevPay;
    double cost;
    Date paymentDate;
    Scanner input = new Scanner(System.in);
   
    public paymentMethod(){
   
}
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
       public String PaymentDetails() {
        return "The payment amount is " + cost;
    }
}