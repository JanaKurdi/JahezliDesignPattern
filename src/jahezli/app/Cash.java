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
public class Cash extends paymentMethod{
    int change;
   
    public Cash(){
    super();
}

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }
  
    
    
}
