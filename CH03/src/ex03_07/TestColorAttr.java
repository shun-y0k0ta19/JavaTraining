package ex03_07;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestColorAttr {

	@Test
	public void test() {
		ColorAttr ca1 = new ColorAttr("hoge");
		ColorAttr ca2 = new ColorAttr("hoge");
		assertTrue(ca1.equals(ca2));
		assertTrue(ca1.hashCode() == ca2.hashCode());
		System.out.println(ca1.hashCode());
		System.out.println(ca2.hashCode());
	}

}
