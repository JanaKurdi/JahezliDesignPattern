package jahezli.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Place {

    String placeName;
    int placeNo;
    String address;
    String phoneNo;
    Table[] tableArray;
    Place[] Place;
    // array to store the record of accounts
    String[][] Places = new String[30][];
    boolean loginStatus;
    // file of  Account record 
    File placesRecords = new File("C:\\Users\\DELL\\OneDrive\\المستندات\\NetBeansProjects\\CPIT-251-GROUP4-master\\placesRecords.txt");
    Scanner input;

    ;


    public Place() throws FileNotFoundException {
        this.input = new Scanner(placesRecords);

    }

    public Place(String placeName, int placeNo, String address, String phoneNo, int tablesnumber) throws FileNotFoundException {
        this.input = new Scanner(placesRecords);
        this.placeName = placeName;
        this.placeNo = placeNo;
        this.address = address;
        this.phoneNo = phoneNo;
        this.tableArray = new Table[tablesnumber];
    }

    public Place(String placeName, int placeNo, String address, String phoneNo, Table[] tableArray) throws FileNotFoundException {
        this.input = new Scanner(placesRecords);

        this.placeName = placeName;
        this.placeNo = placeNo;
        this.address = address;
        this.phoneNo = phoneNo;
        this.tableArray = tableArray;
    }

    public ArrayList<Table> getPlace() {

        ArrayList<Table> Tables = new ArrayList();
        Tables.add(new Table(7, "Piatto", 4));
        Tables.add(new Table(10, "San Carlo", 4));
        Tables.add(new Table(6, "Baco", 5));
        return Tables;

    }

//     placeName int placeNo String address phoneNo tablesnumber;
    public void displayPlaces() {

        while (input.hasNext()) {
            for (int i = 0; i < Places.length; i++) {
                String[] line = input.nextLine().split(" ");
                for (int j = 0; j < line.length; j++) {
                    Places[i][j] = line[j];
                }
            }

        }
    }
}
//    public String bookTable(int Tablenum){
//        

//=======
//public class Place {
//
//    String placeName;
//    int placeNo;
//    String address;
//    String phoneNo;
//    Table[] tableArray;
//    Place[] Place;
//      // array to store the record of accounts
//    String[][] Places = new String[30][];
//    boolean loginStatus;
//    // file of  Account record 
//    File placesRecords = new File("C:\\Users\\DELL\\OneDrive\\المستندات\\NetBeansProjects\\CPIT-251-GROUP4-master\\placesRecords.txt");
//    Scanner input;;
//
//
//    public Place() throws FileNotFoundException {
//        this.input = new Scanner(placesRecords);
// 
//
//    }
//        public Place(String placeName, int placeNo, String address, String phoneNo, int tablesnumber) throws FileNotFoundException {
//        this.input = new Scanner(placesRecords);
//  this.placeName = placeName;
//        this.placeNo = placeNo;
//        this.address = address;
//        this.phoneNo = phoneNo;
//        this.tableArray = new Table[tablesnumber];
//    }
//
//
//    public Place(String placeName, int placeNo, String address, String phoneNo, Table[] tableArray) throws FileNotFoundException {
//        this.input = new Scanner(placesRecords);
//
//        this.placeName = placeName;
//        this.placeNo = placeNo;
//        this.address = address;
//        this.phoneNo = phoneNo;
//        this.tableArray = tableArray;
//    }
//
//    public ArrayList<Table> getPlace() {
//
//        ArrayList<Table> Tables = new ArrayList();
//        Tables.add(new Table(7, "Piatto", 4));
//        Tables.add(new Table(10, "San Carlo", 4));
//        Tables.add(new Table(6, "Baco", 5));
//        return Tables;
//
//    }
//
////     placeName int placeNo String address phoneNo tablesnumber;
//    public void displayPlaces() {
//
//    while (input.hasNext()){
//            for(int i =0;i<Places.length;i++){
//                String [] line = input.nextLine().split(" ");
//                for(int j=0; j< line.length;j++){
//                    Places[i][j] = line[j];
//                }
//            }
//
//    }
//    }
////    public String bookTable(int Tablenum){
////        
////    }
//>>>>>>> origin/master
//    public String getPlaceName() {
//        return placeName;
//    }
//
//    public void setPlaceName(String placeName) {
//        this.placeName = placeName;
//    }
//
//    public int getPlaceNo() {
//        return placeNo;
//    }
//
//    public void setPlaceNo(int placeNo) {
//        this.placeNo = placeNo;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhoneNo() {
//        return phoneNo;
//    }
//
//    public void setPhoneNo(String phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
//    public Table[] getTableArray() {
//        return tableArray;
//    }
//
//    public void setTableArray(Table[] tableArray) {
//        this.tableArray = tableArray;
//    }
//
//    public int searchPlace(int info) {
//        int i = 0;
//        while (Place[i] != null) {
//
//            if (Place[i].getPlaceNo() == info) {
//
//                return i;
//            }
//            i++;
//        }
//        return -1;
//    }
//}
