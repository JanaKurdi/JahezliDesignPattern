package jahezli.app;
/**
 *
 * @author renad
 */
public class ReservationEngineer {

    private ReservationBuilder reservationmaker;

    public ReservationEngineer(ReservationBuilder reservationmaker) {
        this.reservationmaker = reservationmaker;
    }

    public Reservation getReservation() {
        return this.reservationmaker.getReservation();
    }

    public void MakeReservation() {
        this.reservationmaker.buildReservationDate();
        this.reservationmaker.buildReservationTime();
        this.reservationmaker.buildReservationPlace();
        this.reservationmaker.buildReservationTable();
    }

}
