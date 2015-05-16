package ex02_07;

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
	
	public static void main(String[] args) {
		Vehicle vc1 = new Vehicle();
		vc1.Set(100, 100, "Jack");
		vc1.Show();
		
		Vehicle vc2 = new Vehicle("Max");
		vc2.Set(200, 200);
		vc2.Show();
		
	}
}
