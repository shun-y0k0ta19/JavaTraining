package ex22_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWhichChars {

	@Test
	public void test() {
		String str = "auieo あいうえお　ai";
		String tmp = "zxcvbかきくけこ";
		WhichChars wc = new WhichChars(str);
		for(int i = 0; i < str.length(); i++){
			assertTrue(wc.contains(str.charAt(i)));
		}
		for(int i = 0; i < tmp.length(); i++){
			assertFalse(wc.contains(tmp.charAt(i)));
		}
	}

}
