package ex21_01;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class SortLines {
	private OneLineReader olr;
	
	public SortLines(Reader in){
		olr = new OneLineReader(in);
	}
	
	public void sort(List<String> lineList) throws IOException{
		String line =olr.lineRead();
		lineList.add(line);
		while(olr.isEndOfStream() != -1){
			line = olr.lineRead();
			lineList.add(line);
			for(int i = 0; i < lineList.size(); i++){
				if(line.compareTo(lineList.get(i)) <= 0){
					lineList.add(i, line);
					lineList.remove(lineList.size()-1);
					//System.out.println(line);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		FileReader fr;
		List<String> lineList = new LinkedList<String>();
		try {
			fr = new FileReader("/Users/design/JavaTraining/CH21/src/ex21_01/sample");
			SortLines sortlines = new SortLines(fr);
			sortlines.sort(lineList);
			for(int i = 0; i < lineList.size(); i++){
				System.out.println(lineList.get(i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
