package ex03_10;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinkeListClone {
	private final int VCNUM  = 4;

	@Test
	public void test() {
		Vehicle[] vc = new Vehicle[VCNUM];
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		LinkedList list4 = new LinkedList();
		for(Integer i = 0; i < vc.length ; i++){
			vc[i] = new Vehicle(i.toString());
		}
		//List1->List3
		list1.setVehicle(vc[0]);
		list1.setNextlist(list2);
		list2.setVehicle(vc[1]);
		list2.setNextlist(list3);
		list3.setVehicle(vc[2]);
		
		list4 = list1.clone();
		
		//test
		assertNotSame(list4, list1);
		assertSame(list4.getVehicle(), list1.getVehicle());
		assertSame(list4.getNextlist().getVehicle(), list1.getNextlist().getVehicle());
		assertSame(list4.getNextlist().getNextlist().getVehicle(), 
				list1.getNextlist().getNextlist().getVehicle());
	}

}
