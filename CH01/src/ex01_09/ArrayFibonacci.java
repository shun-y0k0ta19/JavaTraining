package ex01_09;

public class ArrayFibonacci {
	static final int MAX_FIBNUM = 50;
	static final int MAX_INDEX = 10;
	
	public static void main(String[] args) {
		
		int[] arrayfib = new int[MAX_INDEX];
		System.out.println("Fibonacci under " + MAX_INDEX);
		int lo = 1;
		int hi = 1;
		int count = 0;		//loop count
		arrayfib[count] = lo;
		
		while (hi < MAX_FIBNUM){
			count++;
			arrayfib[count] = hi;
			hi = lo + hi;	//new hi
			lo = hi - lo;	//old hi
		}
		
		for(int i = 0; i <= count; i++){
			System.out.println(arrayfib[i]);
		}
	}

}
