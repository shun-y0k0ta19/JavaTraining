package ex06_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVerbose {

	@Test
	public void test() {
		Verboseness verboseness = new Verboseness();
		verboseness.setVerbosity(Verbose.Verbosity.SILENT);
		assertEquals(Verbose.Verbosity.SILENT, verboseness.getVerbosity());
	}

}
