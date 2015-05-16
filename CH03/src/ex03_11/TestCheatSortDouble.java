package ex03_11;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheatSortDouble {

	@Test
	public void test() {
		SimpleSortDouble ssd = new SimpleSortDouble();
		CheatSortDouble csd = new CheatSortDouble();
		double[] lst1 = {3.0, 2.1, 0.3, 1.5};
		double[] lst2 = lst1.clone();
		ssd.sort(lst1);
		csd.sort(lst2);
		show(ssd, lst1);
		show(csd, lst2);
		for(int i = 0; i < lst1.length; i++){
			assertEquals(lst1[i], lst2[i], 0.01);
		}
		assertEquals(ssd.getMetrics().toString(), csd.getMetrics().toString());
	}
	
	private void show(SortDouble sd, double[] lst){
		for(double db: lst ){
			System.out.println(db);
		}
		System.out.println(sd.getMetrics().toString());
	}
	
}
