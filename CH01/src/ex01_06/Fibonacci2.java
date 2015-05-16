package ex01_06;

public class Fibonacci2 {

	static final String TITLE = "Fibonacci under 50";
	public static void main(String[] args) {
		System.out.println(TITLE);
		int lo = 1;
		int hi = 1;
		System.out.println(lo);
		while (hi < 50){
			System.out.println(hi);
			hi = lo + hi;	//new hi
			lo = hi - lo;	//old hi
		}
	}

}
