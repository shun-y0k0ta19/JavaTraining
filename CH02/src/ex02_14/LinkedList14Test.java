package ex02_14;

import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.Field;

public class LinkedList14Test {

	@Test
	public void testSetVehicle() throws Exception {
		LinkedList list1 = new LinkedList();
		Vehicle vc = new Vehicle();
		list1.SetVehicle(vc);
		Field field = list1.getClass().getDeclaredField("vehicle");
        field.setAccessible(true);	// privateなfieldにアクセス可能にする
		assertEquals(vc,(Vehicle)field.get(list1));
	}

	@Test
	public void testSetNextlist() throws Exception {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		list1.SetNextlist(list2);
		Field field = list1.getClass().getDeclaredField("nextlist");
        field.setAccessible(true);	// privateなfieldにアクセス可能にする
		assertEquals(list2,(LinkedList)field.get(list1));
	}
	
	@Test
	public void testGetVehicle() throws Exception {
		LinkedList list1 = new LinkedList();
		Vehicle vc = new Vehicle();
		list1.SetVehicle(vc);
		assertEquals(vc,list1.GetVehicle());
	}

	@Test
	public void testGetNextlist() throws Exception {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		list1.SetNextlist(list2);
		assertEquals(list2,list1.GetNextlist());
	}
}
