package ex09_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPascal {

	@Test
	public void testPascal() {
		Pascal pascal = new Pascal(12);
		pascal.show();
		
		pascal = new Pascal(6);
		pascal.show();
	}

}
