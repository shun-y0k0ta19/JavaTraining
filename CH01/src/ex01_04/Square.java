package ex01_04;

public class Square {

	public static void main(String[] args) {
		System.out.println("Square number under 50");
		int num = 1;
		int square = 0;
		while (square < 50){
			System.out.println(square);	//Show square number
			square = num * num;		//calculate square number
			num++;
		}
	}
	
}
