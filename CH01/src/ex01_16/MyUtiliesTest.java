package ex01_16;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyUtiliesTest {
	
	static final double EPSILON = 0.00001;
	static final String FILENAME = "double.dset";
	
	@Before
	public void init() throws IOException {
        File testfile = new File(FILENAME);
        testfile.createNewFile();
        DataOutputStream dostream = new DataOutputStream(new FileOutputStream(testfile));
        dostream.writeDouble(1.001);
        dostream.writeDouble(2.01);
        dostream.close();
	}

    /**
     * Test for getDataSet
     * @throws BadDataSetException
     */
	@Test
	public void getDataSetTest() throws BadDataSetException{
		String filename = "double";
		MyUtilities tester = new MyUtilities();
		double[] ret = tester.getDataSet(filename);
		assertEquals(1.001, ret[0], EPSILON);
		assertEquals(2.01, ret[1], EPSILON);
	}

	/**
	 * Test for BadDataSetException
	 */
	@Test
	public void BadDataSetException() throws BadDataSetException{
		MyUtilities tester = new MyUtilities();
		try{
			tester.getDataSet("aaaa");
		}
		catch(BadDataSetException e){
			assertEquals("aaaa", e.dataset_name);
			assertTrue(e.ex.toString().startsWith("java.io.FileNotFoundException"));
		}
	}
}
