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
public class Place {
    String placeName;
    String address;
    String phoneNo;
    Table[]tableArray;
 
    public Place(){
    
}

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Table[] getTableArray() {
        return tableArray;
    }

    public void setTableArray(Table[] tableArray) {
        this.tableArray = tableArray;
    }
    
    public String searchPlace(){
        
        return placeName;
    }
    
    
}
