package jahezli.app;

import java.util.ArrayList;

public class Place {
    String placeName;
    int placeNo;
    String address;
    String phoneNo;
    Table[]tableArray;
    Place[]Place;
 
    public Place(){
    
}
    public Place(String placeName,int placeNo,String address,String phoneNo,Table[]tableArray){
        this.placeName = placeName;
        this.placeNo = placeNo;
        this.address = address;
        this.phoneNo = phoneNo;
        this.tableArray = tableArray;
}
    public ArrayList<Table> getPlace(){
        
        ArrayList<Table> Tables = new ArrayList();
        Tables.add(new Table(7,"Piatto",4));
        Tables.add(new Table(10,"San Carlo",4));
        Tables.add(new Table(6,"Baco",5));
        return Tables;
        
    }

//    public String bookTable(int Tablenum){
//        
//    }
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    
    public int getPlaceNo(){
        return placeNo;
    }
    
    public void setPlaceNo(int placeNo){
        this.placeNo = placeNo;
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
    
    public int searchPlace(int info) {
        int i = 0;
        while (Place[i] != null) {

            if (Place[i].getPlaceNo() == info) {

                return i;
            }
            i++;
        }
        return -1;
    }
}
