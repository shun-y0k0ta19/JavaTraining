package ex01_15;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLookupTest {
	private String name = "John";
	private String diffname = "john";
	private Object value = 11;

	@Test
	public void testfind() {
		MyLookup tester = new MyLookup(name,value);
		assertEquals(value, tester.find(name));
		assertEquals(null, tester.find(diffname));
	}
	
	@Test
	public void testadd(){
		MyLookup tester = new MyLookup();
		tester.add(name, value);
		assertEquals(value,tester.find(name));
	}
	
	@Test
	public void testremove(){
		MyLookup tester = new MyLookup(name, value);
		assertEquals(false,tester.remove(diffname));
		assertEquals(true,tester.remove(name));
		assertEquals(null,tester.find(name));
	}
	

}
