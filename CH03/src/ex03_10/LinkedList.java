package ex03_10;


public class LinkedList implements Cloneable{
	private Vehicle vehicle;
	private LinkedList nextlist;
	private static int listnum = 1;
	
	public LinkedList(){
	}

	public LinkedList(Vehicle vc){
		this.vehicle = vc;
	}

	// Setter for Vehicle
	public void setVehicle(Vehicle vc){
		this.vehicle = vc;
	}
	
	// Setter for nextlist
	public void setNextlist(LinkedList list){
		this.nextlist = list;
		listnum++;
	}
	
	// Getter for Vehicle
	public Vehicle getVehicle(){
		return this.vehicle;
	}
	
	// Getter for nextlist
	public LinkedList getNextlist(){
		return this.nextlist;
	}
	
	public String toString(){
		String str;
		str = "Vehicle = (" + this.vehicle + ") nextlist = (" + this.nextlist + ")";
		return str;
	}
	
	public int getListNum(){
		return listnum;
	}
	
	public LinkedList clone(){
		try{
			LinkedList tmpList = (LinkedList) super.clone();
			return tmpList;
		}
		catch (CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
	}
}
