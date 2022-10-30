
package jahezli.app;
/**
 *
 * @author renad
 */
public interface ReservationBuilder {

    public void buildReservationDate();

    public void buildReservationTime();

    public void buildReservationPlace();

    public void buildReservationTable();

    public Reservation getReservation();

}
