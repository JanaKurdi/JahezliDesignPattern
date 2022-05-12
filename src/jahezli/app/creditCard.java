/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

/**
 *
 * @author mac
 */
public class creditCard extends paymentMethod {

    String bankName;
    private String cardNo;
    String expiredDate;
    private int CVVNo;

    public creditCard() {
        super();
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

}
