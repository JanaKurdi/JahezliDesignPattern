package jahezli.app;

/**
 *
 * @author renad
 */
public class Reservation {

    private String date;
    private String time;
   private String tableNo;
   private String placeName;
    private String ResvervationNum;
    private double price;

    public Reservation() {

    }
    // this constructor for payment
     public Reservation(String ResvervationNum, double cost) {
        this.ResvervationNum = ResvervationNum;
        this.price = cost;
    }

     public void setResvervationNum(String reserve) {
         ResvervationNum = reserve;   
    }

    public void setPrice(double price) {
         this.price = price;
    }
    public String getResvervationNum() {
        return ResvervationNum;
    }

    public double getPrice() {
        return price;
    }
/////////////////////////////////////////
    public void setReservationDate(String date) {
        this.date = date;
    }

    public void setReservationTime(String time) {
        this.time = time;
    }

    public void setReservationTable(String tableN) {
        this.tableNo = tableN;
    }

    public void setReservationPlace(String placename) {
        this.placeName = placename;
    }

    public String getReservationDate() {
        return date;
    }

    public String getReservationTime() {
        return time;
    }

    public String getReservationTable() {
        return tableNo;
    }

    public String getReservationPlace() {
        return placeName;
    }
}
