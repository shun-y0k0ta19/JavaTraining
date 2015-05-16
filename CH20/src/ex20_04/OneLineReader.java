package ex20_04;

import java.io.*;

public class OneLineReader extends FilterReader {

	public OneLineReader(Reader in) {
		super(in);
	}
	
	public String lineRead() throws IOException{
		int c;
		String str = "";
		while((c = read()) != -1){
			if(c == '\n' || c == '\r'){
				break;
			}
			str += (char)c;
		}
		return str;
	}

	public static void main(String[] args) throws IOException{
		OneLineReader ocfr = new OneLineReader(new FileReader("/Users/design/JavaTraining/CH20/src/ex20_04/sample"));
		System.out.println(ocfr.lineRead());
	}
}
