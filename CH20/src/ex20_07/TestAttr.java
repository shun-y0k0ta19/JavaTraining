package ex20_07;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;


public class TestAttr {

	@Test
	public void test() throws IOException, ClassNotFoundException {
		String name = "test";
		Object value = "Object";
		Attr attrWrite = new Attr(name, value);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(baos);
		attrWrite.writeStream(out);

		DataInputStream in = new DataInputStream(new ByteArrayInputStream(baos.toByteArray()));
		Attr attrRead = new Attr(in);
		assertEquals(attrRead.getName(), name);
		assertEquals(attrRead.getValue(), value);
	}

}
