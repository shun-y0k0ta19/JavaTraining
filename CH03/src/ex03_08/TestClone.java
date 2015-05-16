package ex03_08;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClone {

	@Test
	public void test() throws CloneNotSupportedException {
		Vehicle vc1 = new Vehicle();
		Vehicle vc2 = vc1.clone();
		PassengerVehicle pvc1 = new PassengerVehicle(4,2);
		PassengerVehicle pvc2 = pvc1.clone();
		assertEquals(vc1.toString(), vc2.toString());
		assertEquals(pvc1.toString(), pvc2.toString());
	}

}
