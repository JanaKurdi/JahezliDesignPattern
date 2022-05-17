package jahezli.app;

import java.io.*;
import java.util.regex.*;

public class creditCard extends paymentMethod {

    String bankName;
    private String cardNo;
    String expiredDate;
    private int CVVNo;
    Double total;
    private File file = new File("CreditCardinfo.txt");

    public creditCard() {
    }
    
    public creditCard(Double total,String Cardno, String ExpiredDate, int CVVno){
         super();
//         this.bankName = Bankname;
//         this.cardNo = Cardno;
//         this.expiredDate = ExpiredDate;
//         this.CVVNo = CVVno;
//         this.total = total;
//         
                 try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("The payment amount : " + cost
                    + "\npayed by the card : " + Cardno
                    + "\nwith the expiry date : " + ExpiredDate
                    + "\nCVV : " + CVVno);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry, File not found!");
        }  
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getCVVNo() {
        return CVVNo;
    }

    public void setCVVNo(int CVVNo) {
        this.CVVNo = CVVNo;
    }

    public boolean authorized() {
        boolean authorizedcheck;

        if ((cardNo == null) || (cardNo.length() < 13) || (cardNo.length() > 19)) {
            System.out.println("failed length check");
            authorizedcheck = false;
            return authorized();
        } else {
            System.out.println("valid");
            authorizedcheck = true;
        }
        return authorizedcheck;
    }
    
      public String toString() {
        return "The payment amount : " + cost
                + "\npayed by the card : " + cardNo
                + "\nwith the expiry date : " + expiredDate;
    }  
}
