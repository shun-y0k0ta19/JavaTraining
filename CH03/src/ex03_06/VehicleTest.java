package ex03_06;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void startTest() {
		GasTank gasTank = new GasTank();
		Battery battery = new Battery();
		Vehicle fuelVC = new Vehicle(gasTank);
		Vehicle electricVC = new Vehicle(battery);
		assertFalse(fuelVC.start());
		assertFalse(electricVC.start());
		fuelVC.energySource.fueling(20.0);
		electricVC.energySource.charging(10.0);
		assertTrue(fuelVC.start());
		assertTrue(electricVC.start());		
	}

}
