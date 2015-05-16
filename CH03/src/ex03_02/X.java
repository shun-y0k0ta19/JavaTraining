package ex03_02;

public class X {
	protected int xMask = 0x00ff;
	protected int fullMask;
	
	public X(){
		System.out.printf("<Before calling X constructor> xMask: %04x yMask: %04x fullMask: %04x%n", xMask, 0x0000, fullMask);
		fullMask = xMask;
		System.out.printf("<After  calling X constructor> xMask: %04x yMask: %04x fullMask: %04x%n", xMask, 0x0000, fullMask);
	}
	
	public int mask(int orig){
		return (orig & fullMask);
	}

}
