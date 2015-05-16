package ex12_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestObjctNotFoundException {

	@Test
	public void test() {
		LinkedList<String> l1 = new LinkedList<String>("ab");
		LinkedList<String> l2 = new LinkedList<String>("cd");
		LinkedList<String> l3 = new LinkedList<String>("ef");
		LinkedList<String> l4 = new LinkedList<String>("gh");
		LinkedList<String> l5 = new LinkedList<String>("ij");
		
		l1.setNextList(l2);
		l2.setNextList(l3);
		l3.setNextList(l4);
		l4.setNextList(l5);
		
		try {
			l1.find("ef");
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.show();
		}
		
		try {
			l1.find("fasd");
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.show();
		}
	}

}
