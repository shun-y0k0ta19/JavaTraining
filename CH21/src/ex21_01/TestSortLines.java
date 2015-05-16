package ex21_01;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestSortLines {

	@Test
	public void testSortLines() throws Exception {
		FileReader fr;
		List<String> lineList = new LinkedList<String>();
		try {
			fr = new FileReader("/Users/design/JavaTraining/CH20/src/ex20_04/sample");
			SortLines sortlines = new SortLines(fr);
			sortlines.sort(lineList);
			for(int i = 1; i < lineList.size(); i++){
				assertTrue(lineList.get(i).compareTo(lineList.get(i-1)) >= 0);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(lineList.get(0));
	}

}
