package ex02_14;

/**
 * 識別番号と次の識別番号は変更を許すメソッドを持つべきではない。
 * 
 *
 */

public class Vehicle {
	private int speed;
	private int angle;
	private String owner;
	private long vehicleID;
	
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
	
	// Set speed, angle, owner
	public void SetAll(int speed, int angle, String owner){
		this.speed = speed;
		this.angle = angle;
		this.owner = owner;
	}
	
	// Setter for speed
	public void SetSpeed(int speed){
		this.speed = speed;
	}
	
	// Setter for angle
	public void SetAngle(int angle){
		this.angle = angle;
	}
	
	// Setter for owner
	public void SetOwner(String owner){
		this.owner = owner;
	}
	
	// Getter for speed
	public int GetSpeed(){
		return this.speed;
	}
	
	// Getter for angle
	public int GetAngle(){
		return this.angle;
	}
	
	// Getter for owner
	public String GetOwner(){
		return this.owner;
	}
	
	// Getter for VehicleID
	public long GetVehicleID(){
		return this.vehicleID;
	}
	
	public static long MaxID(){
		return nextVehicleID - 1;
	}
	
	public String toString(){
		String str;
		str = "Vehicle" + this.vehicleID + " speed = " + this.speed +
				" angle = " + this.angle + " owner = " + this.owner;
		return str;
	}

}
