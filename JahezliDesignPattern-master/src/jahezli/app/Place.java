package jahezli.app;
/**
 *
 * @author ghaidaa
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    ArrayList<Place>places=new ArrayList();
    ;


    public Place(ArrayList<Place> places) throws FileNotFoundException {
        this.input = new Scanner(placesRecords);
        this.places = places;
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
    public void Table(int tableNo, String placeName,int chair){
        System.out.println("table" + tableNo + "At" + placeName + "has " + chair + "chair");
    }

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