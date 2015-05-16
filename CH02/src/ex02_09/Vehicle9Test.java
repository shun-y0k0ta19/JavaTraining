package ex02_09;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vehicle9Test {

	@Test
	public void testSet() {
		int num = 100;
		String name = "Test";
		long firstID = 0;
		long secID = 1;
		Vehicle vc1 = new Vehicle();
		vc1.Set(num, num, name);
		assertEquals(num, vc1.speed);
		assertEquals(num, vc1.angle);
		assertEquals(name, vc1.owner);
		assertEquals(firstID, vc1.vehicleID);
		assertEquals(secID, Vehicle.nextVehicleID);		
	}
	
	/**
	 * MaxID is 3
	 */
	@Test
	public void testMaxID(){
		long MaxID = 3;
		Vehicle vc2 =new Vehicle();
		Vehicle vc3 =new Vehicle();
		Vehicle vc4 =new Vehicle();
		vc2.Show();
		vc3.Show();
		vc4.Show();
		assertEquals(MaxID, Vehicle.MaxID());
	}

}
