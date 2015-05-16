package ex02_08;

public class Vehicle {
	public int speed;
	public int angle;
	public String owner;
	public long vehicleID = 0;
	
	public static long nextVehicleID = 1;
	
	public  Vehicle(){
	}
	
	public Vehicle(String owner){
		this.owner = owner;
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
		this.vehicleID = Vehicle.nextVehicleID;
		Vehicle.nextVehicleID++;
	}
	
	public void Set(int speed, int angle){
		this.speed = speed;
		this.angle = angle;		
		this.vehicleID = Vehicle.nextVehicleID;
		Vehicle.nextVehicleID++;
	}
}
