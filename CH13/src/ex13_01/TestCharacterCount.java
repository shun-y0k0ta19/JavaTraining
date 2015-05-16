package ex13_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCharacterCount {

	@Test
	public void test() {
		String str = "abbcccddddeeeee ああ";
		CharacterCount chCount = new CharacterCount();
		
		assertEquals(1, chCount.count(str, 'a'));
		assertEquals(2, chCount.count(str, 'b'));
		assertEquals(3, chCount.count(str, 'c'));
		assertEquals(4, chCount.count(str, 'd'));
		assertEquals(5, chCount.count(str, 'e'));
		assertEquals(1, chCount.count(str, ' '));
		assertEquals(2, chCount.count(str, 'あ'));	
	}

}
