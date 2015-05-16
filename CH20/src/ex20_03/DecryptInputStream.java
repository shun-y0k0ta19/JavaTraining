package ex20_03;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecryptInputStream extends FilterInputStream {
	private final byte key = (byte) 0xFF;

	public DecryptInputStream(InputStream in) {
		super(in);
	}	
	
	public int read() throws IOException{
		int c = super.read();
		int res = c ^ key;
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		EncryptOutputStream eos = new EncryptOutputStream(System.out);
		DecryptInputStream dis = new DecryptInputStream(System.in);
		int decryptedByte = dis.read();
		System.out.printf("%x\n", decryptedByte);
		eos.write(decryptedByte);
		eos.close();
		dis.close();
	}


}
