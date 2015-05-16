package ex20_05;

import java.io.*;

public class FindWord {
	public static void main(String[] args) throws IOException{
		if (args.length != 2){
			throw new IllegalArgumentException("need word and file");
		}
		
		FileReader fileIn = new FileReader(args[1]);
		LineNumberReader in = new LineNumberReader(fileIn);
		String str;
		while((str = in.readLine()) != null){
			if(str.indexOf(args[0]) != -1){
				System.out.println("\"" + args[0] + "\" at line " + in.getLineNumber());
			}
		}
		in.close();
	}
}
