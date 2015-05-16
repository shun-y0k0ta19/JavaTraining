package ex04_03;

public interface LinkedList {

	// Setter for Vehicle
	public void setVehicle(Vehicle vc);
	
	// Setter for nextlist
	public void setNextlist(LinkedListImpl list);
	
	// Getter for Vehicle
	public Vehicle getVehicle();
	
	// Getter for nextlist
	public LinkedListImpl getNextlist();
	
	public String toString();
	
	public int getListNum();
	
	public LinkedListImpl clone();

}
