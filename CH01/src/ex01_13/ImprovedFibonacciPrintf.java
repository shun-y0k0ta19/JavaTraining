package ex01_13;

public class ImprovedFibonacciPrintf {

	static final int MAX_INDEX = 9;
	static final int MIN_INDEX = 1;
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		String mark;
		
		System.out.printf(MAX_INDEX + ": " + lo +"%n");
		for(int i = MAX_INDEX - 1; i >= MIN_INDEX; i--){
			if (hi % 2 == 0)
				mark = " *";
			else
				mark ="";
			System.out.printf(i + ": " + hi + mark + "%n");
			hi = lo + hi;
			lo = hi - lo;
		}
	}


}
