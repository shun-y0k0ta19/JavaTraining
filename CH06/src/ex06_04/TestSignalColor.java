package ex06_04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSignalColor {

	@Test
	public void test() {
		//SignalColor sigColor = new SignalColor();
		assertEquals("RED", SignalColor.Signal.RED.getColor().color);
		assertEquals("YELLOW", SignalColor.Signal.YELLOW.getColor().color);
		assertEquals("BLUE", SignalColor.Signal.BLUE.getColor().color);
	}

}
