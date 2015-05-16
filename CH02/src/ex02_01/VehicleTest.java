package ex02_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void Vehicletest() {
		Vehicle vehicle = new Vehicle();
		assertEquals(100,vehicle.speed);
		assertEquals(0,vehicle.angle);
		assertEquals("Max",vehicle.owner);		
	}

}
