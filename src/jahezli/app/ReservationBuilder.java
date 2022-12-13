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

    public String buildReservationNumber();

    public double buildReservationPrice();

    public void buildReservationCustomerNumber();

    public Reservation getReservation();

}
