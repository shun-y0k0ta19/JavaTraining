package ex04_01;

public class Battery implements EnergySource {

	private double charge;
	
	public void charging(double charge){
		this.charge = charge;
	}
	
	@Override
	public boolean empty() {
		return charge <= 0;
	}
}
