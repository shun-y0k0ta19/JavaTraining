package ex02_16;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedList16Test {

	@Test
	public void testGetListNum() {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		assertEquals(1, l1.GetListNum());
		
		l1.SetNextlist(l2);
		assertEquals(2, l2.GetListNum());
		
		l2.SetNextlist(l3);
		assertEquals(3, l3.GetListNum());		
	}

}
