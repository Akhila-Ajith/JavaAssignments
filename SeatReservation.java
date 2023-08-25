package controlStructures;

public class SeatReservation {

	String trainID;
	String trainName;
	String passengerName;
	SeatReservation(String trainID,String trainName,String passengerName){
		this.trainID = trainID;
		this.trainName = trainName;
		this.passengerName = passengerName;
	}
	public String getReservation() {
		if (trainID.equals("12345"))
			return "Seat Confirmed";
		return "Seat Not COnfirmed";
	
	
}}
