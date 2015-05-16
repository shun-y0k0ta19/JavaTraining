package ex02_17;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vehicle17Test {

	@Test
	public void testTurn() {
		int angle = 10;
		Vehicle tester = new Vehicle();
		tester.turn(Vehicle.Turn.TURN_LEFT);
		tester.turn(angle);
		assertEquals(-10, tester.GetAngle());
		
		tester.turn(Vehicle.Turn.TURN_RIGHT);
		tester.turn(angle + 10);
		assertEquals(10, tester.GetAngle());
	}

}
