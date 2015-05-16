package ex03_01;

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
	
	public static void main(String[] args) {
		PassengerVehicle vc1 = new PassengerVehicle(5,2);
		PassengerVehicle vc2 = new PassengerVehicle(2,1);
		System.out.println("vc1: seats = " + vc1.getSeatNum() + ", passengers = " + vc1.getPassengerNum());
		System.out.println("vc2: seats = " + vc2.getSeatNum() + ", passengers = " + vc2.getPassengerNum());
	}

}
