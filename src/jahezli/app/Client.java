package jahezli.app;

public class Client {

    public static void main(String[] args) {

        ReservationBuilder concreteBuilder = new ConcreteBuilder();

        ReservationEngineer reservEnginner = new ReservationEngineer(concreteBuilder);
        reservEnginner.MakeReservation();
        Reservation firstreservation = reservEnginner.getReservation();
        System.out.println("reservation build");
        System.out.println("" + firstreservation.getReservationDate());
        System.out.println("" + firstreservation.getReservationPlace());
        System.out.println("" + firstreservation.getReservationTable());
        System.out.println("" + firstreservation.getReservationTime());

    }
}
