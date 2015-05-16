package ex03_09;

import java.util.ArrayList;


public class Garage implements Cloneable{
	private ArrayList<Vehicle> vcList;
	
	public Garage(){
		vcList = new ArrayList<Vehicle>();
	}
	
	void setVehicleToList(Vehicle vc){
		vcList.add(vc);
	}
	
	public ArrayList<Vehicle> getList(){
		return vcList;
	}
	
	@SuppressWarnings("unchecked")
	public Garage clone() throws CloneNotSupportedException{
		Garage clonedGarage = (Garage)super.clone();
		clonedGarage.vcList = (ArrayList<Vehicle>)this.vcList.clone();
		return clonedGarage;
	}
}
