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
    private int cardNo;
    String expiredDate;
    private int CVVNo;
    
  public creditCard(){
      super();
  } 

  public boolean authorized(){
        return false;
  }  
    
    
}
