package ex02_11;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedList11Test {

	@Test
	public void testtoString() {
		Vehicle vc1 = new Vehicle();
		Vehicle vc2 = new Vehicle();
		String str = "Vehicle = (Vehicle0 speed = 0 angle = 0 owner = null) nextlist = (Vehicle = (Vehicle1 speed = 0 angle = 0 owner = null) nextlist = (null))";
		LinkedList l1 = new LinkedList(vc1);
		l1.nextlist = new LinkedList(vc2);
		assertEquals(str,l1.toString());
	}

}
