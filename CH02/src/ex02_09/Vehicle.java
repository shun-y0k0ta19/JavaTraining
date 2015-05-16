package ex02_09;

public class Vehicle {
	public int speed;
	public int angle;
	public String owner;
	public long vehicleID;
	
	public static long nextVehicleID = 0;
	
	public  Vehicle(){
		this.vehicleID = nextVehicleID;
		nextVehicleID++;
	}
	
	public Vehicle(String owner){
		this.owner = owner;
		this.vehicleID = nextVehicleID;
		nextVehicleID++;
	}
	
	public void Show(){
		System.out.println("speed = " + this.speed);
		System.out.println("angle = " + this.angle);
		System.out.println("owner = " + this.owner);
		System.out.println("vehicleID = " + this.vehicleID);
		System.out.println("nextVehicleID = " + Vehicle.nextVehicleID);		
	}
	
	public void Set(int speed, int angle, String owner){
		this.speed = speed;
		this.angle = angle;
		this.owner = owner;
	}
	
	public void Set(int speed, int angle){
		this.speed = speed;
		this.angle = angle;		
	}
	
	public static long MaxID(){
		return nextVehicleID - 1;
	}
}
