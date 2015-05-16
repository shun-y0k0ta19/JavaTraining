package ex04_01;

public class GasTank implements EnergySource {
	private double fuel;
	
	public void fueling(double fuel){
		this.fuel = fuel;
	}
	
	@Override
	public boolean empty() {
		return fuel <= 0;
	}
}
