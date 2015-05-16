package ex03_06;

abstract public class EnergySource {

	abstract boolean empty();
	
	public void fueling(double fuel){
		System.out.println("GasTank does not exist.");
	}
	
	public void charging(double charge){
		System.out.println("Battery does not exist.");
	}
}
