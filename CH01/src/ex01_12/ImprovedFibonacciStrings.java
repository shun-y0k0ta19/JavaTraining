package ex01_12;

public class ImprovedFibonacciStrings {

	static final int MAX_INDEX = 10;
	static final int MIN_INDEX = 1;
	static final int ARRAYMAX = MAX_INDEX - 1;
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		String[] outputs = new String[MAX_INDEX];
		String mark;
		
		outputs[ARRAYMAX] = ARRAYMAX + ": " +lo;
		for(int i = ARRAYMAX - 1; i >= MIN_INDEX; i--){
			if (hi % 2 == 0)
				mark = " *";
			else
				mark ="";
			outputs[i] = i + ": " + hi + mark;
			hi = lo + hi;
			lo = hi - lo;
		}
		
		for(int i = ARRAYMAX; i >= MIN_INDEX; i--){
			System.out.println(outputs[i]);
		}
	}
}
