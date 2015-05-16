package ex02_16;


public class LinkedList {
	private Vehicle vehicle;
	private LinkedList nextlist;
	private static int listnum = 1;
	
	public LinkedList(){
	}

	public LinkedList(Vehicle vc){
		this.vehicle = vc;
	}

	// Setter for Vehicle
	public void SetVehicle(Vehicle vc){
		this.vehicle = vc;
	}
	
	// Setter for nextlist
	public void SetNextlist(LinkedList list){
		this.nextlist = list;
		listnum++;
	}
	
	// Getter for Vehicle
	public Vehicle GetVehicle(){
		return this.vehicle;
	}
	
	// Getter for nextlist
	public LinkedList GetNextlist(){
		return this.nextlist;
	}
	
	public String toString(){
		String str;
		str = "Vehicle = (" + this.vehicle + ") nextlist = (" + this.nextlist + ")";
		return str;
	}
	
	public int GetListNum(){
		return listnum;
	}
}
