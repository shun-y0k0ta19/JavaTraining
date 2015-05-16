package ex09_01;

public class InfCalc {

	
	
	public static void main(String[] args) {
		System.out.printf("%f%n", Double.POSITIVE_INFINITY + Double.POSITIVE_INFINITY);
		System.out.printf("%f%n", Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY);
		System.out.printf("%f%n", Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY);
		System.out.printf("%f%n", Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY);
		System.out.printf("%f%n", Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY);
		System.out.printf("%f%n", Double.POSITIVE_INFINITY - Double.NEGATIVE_INFINITY);
		System.out.printf("%f%n", Double.POSITIVE_INFINITY * Double.NEGATIVE_INFINITY);
		System.out.printf("%f%n", Double.POSITIVE_INFINITY / Double.NEGATIVE_INFINITY);
	}

}
