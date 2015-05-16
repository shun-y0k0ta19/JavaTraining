package ex03_08;

public class PassengerVehicle extends Vehicle {

	private int seatNum;
	private int passengerNum;
	
	public PassengerVehicle(int seatNum, int passengerNum){
		this.seatNum = seatNum;
		this.passengerNum = passengerNum;
	}
	
	public int getSeatNum(){
		return seatNum;
	}
	
	public int getPassengerNum(){
		return passengerNum;
	}
	
	public PassengerVehicle clone() throws CloneNotSupportedException{
		try{
			return (PassengerVehicle) super.clone();
		}
		catch(CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
	}

}
