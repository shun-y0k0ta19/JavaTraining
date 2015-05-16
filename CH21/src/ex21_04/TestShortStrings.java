package ex21_04;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class TestShortStrings {
	private static final int STRING_LENGTH = 3;
	private LinkedList<String> list;
	private ShortStrings ss;

	@Before
	public void setUp() throws Exception {
		list = new LinkedList<String>();
		list.add("aa");
		list.add("bb");
		ss = new ShortStrings(list.listIterator(), STRING_LENGTH);
	}

	@Test
	public void test() {
		assertEquals(-1, ss.previousIndex());
		assertEquals(0, ss.nextIndex());
		assertEquals("aa", ss.next());
		assertEquals("bb", ss.next());
		assertEquals("bb", ss.previous());
	}

}
