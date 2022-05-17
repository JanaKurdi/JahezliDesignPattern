package jahezli.app;

import java.util.ArrayList;

public class Manager extends Reservation{
    String placeName;
    private ArrayList<Reservation> reservations = new ArrayList<>();
    
    public Manager(){
        
}
    public Manager(String placeName){
     super();
     this.placeName = placeName;     
}

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    
    public String confirmReservation(int reservationNo){
		for (int i = 0; i < reservations.size(); i++) {
			Reservation Temp = reservations.get(i);

			if (Temp.getReservationNo() == reservationNo) {
				//check that the class dose not have a trainer
				if (Temp.getReservationNo() == 0) {
					Temp.setReservationNo(0);
					reservations.add(Temp);
					return Temp.getReservationNo() + " Reservation is confirmed";
				} else {
					return Temp.getReservationNo() + " Class is already assigned to Trainer";
				}

			}
		}
		return "";
	}
    
    @Override
     public String cancelReservation(int reservationNo){
		for (int i = 0; i < reservations.size(); i++) {
			Reservation Temp = reservations.get(i);
			if (Temp.getReservationNo() == reservationNo) {

				reservations.remove(i);
				return Temp.getReservationNo() + " The reservation has been cancelled successfully";
			}
		}
        return null;
	}
}
