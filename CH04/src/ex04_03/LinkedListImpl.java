package ex04_03;


public class LinkedListImpl implements Cloneable, LinkedList{
	private Vehicle vehicle;
	private LinkedListImpl nextlist;
	private static int listnum = 1;
	
	public LinkedListImpl(){
	}

	public LinkedListImpl(Vehicle vc){
		this.vehicle = vc;
	}

	// Setter for Vehicle
	public void setVehicle(Vehicle vc){
		this.vehicle = vc;
	}
	
	// Setter for nextlist
	public void setNextlist(LinkedListImpl list){
		this.nextlist = list;
		listnum++;
	}
	
	// Getter for Vehicle
	public Vehicle getVehicle(){
		return this.vehicle;
	}
	
	// Getter for nextlist
	public LinkedListImpl getNextlist(){
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
	
	public LinkedListImpl clone(){
		try{
			LinkedListImpl tmpList = (LinkedListImpl) super.clone();
			return tmpList;
		}
		catch (CloneNotSupportedException e){
			throw new InternalError(e.toString());
		}
	}
}
