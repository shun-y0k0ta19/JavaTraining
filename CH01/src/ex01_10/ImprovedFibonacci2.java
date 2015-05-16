package ex01_10;

public class ImprovedFibonacci2 {

	static final int MAX_INDEX = 10;
	static final int MIN_INDEX = 1;
	
	public static void main(String[] args) {
		SaveFibonacci[] arrayfib = new SaveFibonacci[MAX_INDEX];
		int lo = 1;
		int hi = 1;
		int arraymax = MAX_INDEX - 1;
		String mark;
		
		arrayfib[arraymax] = new SaveFibonacci(lo);
		for(int i = arraymax - 1; i >= MIN_INDEX; i--){
			arrayfib[i] = new SaveFibonacci(hi);
			hi = lo + hi;
			lo = hi - lo;
		}
		
		for(int i = MAX_INDEX - 1; i > 0; i--){
			if (arrayfib[i].even){
				mark = " *";
			}
			else{
				mark ="";
			}
			System.out.println(i + ": " + arrayfib[i].fibnum + mark);
		}
	}

}
