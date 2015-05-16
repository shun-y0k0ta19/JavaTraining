package ex03_06;

public class Battery extends EnergySource {

	private double charge;
	
	@Override
	public void charging(double charge){
		this.charge = charge;
	}
	
	@Override
	public boolean empty() {
		return charge <= 0;
	}

}
