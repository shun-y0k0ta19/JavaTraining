package ex01_03;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci under 50");
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
