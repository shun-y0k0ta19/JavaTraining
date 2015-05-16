package ex22_13;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class TestAttrReader {

	private static final String FILE_PATH = "test.txt";

	@Before
	public void setUp() {
		try {
			FileWriter fr = new FileWriter(FILE_PATH);
			fr.write("name=yokota\n");
			fr.write("age=25\n");
			fr.write("Location=Nagano\n");
			fr.flush();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testReadAttrTable() {
		try {
			FileReader reader = new FileReader(FILE_PATH);
			Attributed attrs = AttrReader.readAttrs(reader);
			Iterator<Attr> it = attrs.attrs();
			Attr attr = it.next();
			assertEquals(attr.getName(), "age");
			assertEquals(attr.getValue(), "25");
			attr = it.next();
			assertEquals(attr.getName(), "name");
			assertEquals(attr.getValue(), "yokota");
			attr = it.next();
			assertEquals(attr.getName(), "Location");
			assertEquals(attr.getValue(), "Nagano");
			assertFalse(it.hasNext());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
