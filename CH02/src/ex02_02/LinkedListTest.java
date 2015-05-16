package ex02_02;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void LinkedListtest() {
		LinkedList ll = new LinkedList();
		assertEquals("this", ll.obj);
		assertEquals("this next", ll.nextlist.obj);
	}

}
