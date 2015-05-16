package ex10_02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringChanger {

	@Test
	public void testAddEscapeSequence() {
		String words = "a\n\t\b\r\f\\\'\"b";
		String result;
		StringChanger strChanger = new StringChanger();
		result = strChanger.addEscapeSequence(words);
		assertEquals("a\\n\\t\\b\\r\\f\\\\\\\'\\\"b", result);
	}
}
