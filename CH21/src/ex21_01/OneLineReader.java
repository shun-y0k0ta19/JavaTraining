package ex21_01;

import java.io.*;

public class OneLineReader extends FilterReader {
	private int c = -1;
	
	public OneLineReader(Reader in) {
		super(in);
	}
	
	public String lineRead() throws IOException{
		String str = "";
		while((c = read()) != -1){
			if(c == '\n' || c == '\r'){
				break;
			}
			str += (char)c;
		}
		return str;
	}
	
	public int isEndOfStream(){
		return c;
	}
}