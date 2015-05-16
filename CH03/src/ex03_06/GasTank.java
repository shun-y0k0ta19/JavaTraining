package ex03_06;

public class GasTank extends EnergySource {
	private double fuel;
	
	@Override
	public void fueling(double fuel){
		this.fuel = fuel;
	}
	
	@Override
	public boolean empty() {
		return fuel <= 0;
	}

}
