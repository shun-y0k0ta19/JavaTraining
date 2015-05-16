package ex02_10;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vehicle10Test {

	@Test
	public void testtoString() {
		int num = 100;
		String name = "Test";
		String str = "Vehicle0 speed = 100 angle = 100 owner = Test";
		Vehicle vc1 = new Vehicle();
		vc1.Set(num, num, name);
		assertEquals(str,vc1.toString());
	}

}
