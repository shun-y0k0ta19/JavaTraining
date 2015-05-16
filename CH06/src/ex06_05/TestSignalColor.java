package ex06_05;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSignalColor {

	@Test
	public void test() {
		//SignalColor sigColor = new SignalColor();
		assertEquals("RED", SignalColor.Signal.RED);
		assertEquals("YELLOW", SignalColor.Signal.YELLOW);
		assertEquals("BLUE", SignalColor.Signal.BLUE);
	}

}
