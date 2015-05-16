package ex04_02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortVehicle {

	@Test
	public void test() {
		Vehicle vc[] = new Vehicle[4];
		for(int i = vc.length - 1; i >= 0; i--){
			vc[i] = new Vehicle();
		}
		SimpleSortVehicle ssv = new SimpleSortVehicle();
		ssv.sort(vc);
		for(int i = 0; i <vc.length; i++){
			assertEquals(i,vc[i].getVehicleID());
		}

	}

}
