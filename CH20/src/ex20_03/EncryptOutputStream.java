package ex20_03;


import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptOutputStream extends FilterOutputStream {
	private final byte key = (byte) 0xFF;
	
	public EncryptOutputStream(OutputStream in) {
		super(in);
	}
	
	public void write(int c) throws IOException{
		int res = c ^ key;
		super.write(res);
	}
	

}
