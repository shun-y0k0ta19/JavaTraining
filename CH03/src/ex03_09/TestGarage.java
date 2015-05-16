package ex03_09;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGarage {

	@Test
	public void test() throws CloneNotSupportedException {
		Garage gr1 = new Garage();
		Vehicle vc1 = new Vehicle("John");
		Vehicle vc2 = new Vehicle("Max");
		Vehicle vc3 = new Vehicle("Jack");
		gr1.setVehicleToList(vc1);
		gr1.setVehicleToList(vc2);
		gr1.setVehicleToList(vc3);
		Garage gr2 = gr1.clone();
		//gr2.setVehicleToList(new Vehicle("Hugo"));
		System.out.println(gr1.getList().toString()+" "+gr2.getList().toString());
		assertEquals(gr1.getList(), gr2.getList());
		assertNotSame(gr1.getList(), gr2.getList());
		
	}

}
