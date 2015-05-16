package ex04_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void StartTest() {
		GasTank gasTank = new GasTank();
		Battery battery = new Battery();
		Vehicle fuelVC = new Vehicle(gasTank);
		Vehicle electricVC = new Vehicle(battery);
		assertFalse(fuelVC.start());
		assertFalse(electricVC.start());
		assertTrue(fuelVC.start());
		assertTrue(electricVC.start());		
	}

}
