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
public interface User {

    public String getPhoneNo();

    public String getPassword();

    public void setPhoneNo(String phoneNo);

    public void setPassword(String password);
    
    public void addUser(User user);

    
    

}
