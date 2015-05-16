package ex03_02;

public class Y extends X{
	protected int yMask = 0xff00;
	
	public Y(){
		System.out.printf("<Before calling Y constructor> xMask: %04x yMask: %04x fullMask: %04x%n", xMask, yMask, fullMask);
		fullMask |= yMask;
		System.out.printf("<After  calling Y constructor> xMask: %04x yMask: %04x fullMask: %04x%n", xMask, yMask, fullMask);
	}

	public static void main(String args[]){
		Y y = new Y();
	}
	
}
