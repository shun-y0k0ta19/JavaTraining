package ex03_12;

public class Vehicle implements Cloneable{
	private int speed;
	private int angle;
	private String owner;
	private long vehicleID;
	static final int TURN_LEFT = -1;
	static final int TURN_RIGHT = 1;
	static enum Turn{TURN_LEFT, TURN_RIGHT};
	private int turnState = TURN_RIGHT;
	
	public static long nextVehicleID = 0;
	
	public  Vehicle(){
		this.owner = "none";
		this.vehicleID = nextVehicleID;
		nextVehicleID++;
	}
	
	public Vehicle(String owner){
		this.owner = owner;
		this.vehicleID = nextVehicleID;
		nextVehicleID++;
	}
	
	public void show(){
		System.out.println("speed = " + this.speed);
		System.out.println("angle = " + this.angle);
		System.out.println("owner = " + this.owner);
		System.out.println("vehicleID = " + this.vehicleID);
		System.out.println("nextVehicleID = " + Vehicle.nextVehicleID);		
	}
	
	// Set speed, angle, owner
	public void setAll(int speed, int angle, String owner){
		this.speed = speed;
		this.angle = angle;
		this.owner = owner;
	}
	
	// Setter for speed
	public void changeSpeed(int speed){
		this.speed = speed;
	}
	
	// Setter for speed to 0
	public void stop(){
		this.speed = 0;
	}
	
	// Setter for angle
	public void setAngle(int angle){
		this.angle = angle;
	}
	
	// Setter for owner
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	// Getter for speed
	public int getSpeed(){
		return this.speed;
	}
	
	// Getter for angle
	public int getAngle(){
		return this.angle;
	}
	
	// Getter for owner
	public String getOwner(){
		return this.owner;
	}
	
	// Getter for VehicleID
	public long getVehicleID(){
		return this.vehicleID;
	}
	
	public static long maxID(){
		return nextVehicleID - 1;
	}
	
	public String toString(){
		String str;
		str = "Vehicle" + this.vehicleID + " speed = " + this.speed +
				" angle = " + this.angle + " owner = " + this.owner;
		return str;
	}
	
	public void turn(int angle){
		this.angle += angle * this.turnState;
	}
	
	public void turn(Turn dir){
		if(dir == Turn.TURN_LEFT){
			this.turnState = TURN_LEFT;
		}
		else{
			this.turnState = TURN_RIGHT;
		}
	}
	
	public Vehicle clone() throws CloneNotSupportedException{
		try{
			return (Vehicle) super.clone();
		}
		catch(CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
	}
}
