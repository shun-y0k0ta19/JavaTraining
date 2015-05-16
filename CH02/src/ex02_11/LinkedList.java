package ex02_11;

public class LinkedList {
	public Vehicle vehicle;
	public LinkedList nextlist;
	
	public LinkedList(){
	}

	public LinkedList(Vehicle vc){
		this.vehicle = vc;
	}

	public String toString(){
		String str;
		str = "Vehicle = (" + this.vehicle + ") nextlist = (" + this.nextlist + ")";
		return str;
	}
}
