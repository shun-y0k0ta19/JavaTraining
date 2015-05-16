package ex02_04;

public class Answer {
	public int speed;
	public int angle;
	public String owner;
	public long vehicleID;
	
	public static long nextVehicleID = 100;
	/**
	 * インスタンス化するときに識別IDは再定義されるので、finalにすべきではない。
	 */
}
