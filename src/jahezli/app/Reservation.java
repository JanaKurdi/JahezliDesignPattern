package jahezli.app;
/**
 *
 * @author renad
 */
public class Reservation {

    String date;
    String time;
    String tableNo;
    String placeName;

    public Reservation() {

    }

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

