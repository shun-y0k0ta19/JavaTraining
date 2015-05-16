package ex20_07;

import java.io.*;

public class Attr {
	private final String name;
	private Object value = null;
	
	public Attr(String name){
		this.name = name;
	}
	
	public Attr(String name, Object value){
		this.name = name;
		this.value = value;
	}
	
	public Attr(DataInputStream din) throws IOException, ClassNotFoundException {
		this.name = din.readUTF();
		byte[] b = new byte[din.readInt()];
		din.read(b);
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bais);
		this.value = ois.readObject();
	}
	
	public String getName(){
		return name;
	}
	
	public Object getValue(){
		return value;
	}
	
	public Object setValue(Object newValue){
		Object oldVal = value;
		value = newValue;
		return oldVal;
	}
	
	public String toString(){
		return name + "+'" + value + "'";
	}
	
	public void writeStream(DataOutputStream dout) throws IOException {
		dout.writeUTF(name);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(value);
		oos.close();
		baos.close();
		dout.writeInt(baos.toByteArray().length);
		dout.write(baos.toByteArray());
	}
}
