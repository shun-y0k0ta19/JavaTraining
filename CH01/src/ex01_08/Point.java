package ex01_08;

public class Point {

	public double x,y;
	static final double X = 1.0;
	static final double Y = 2.0;
	
	public Point(){
		x = 0.0;
		y = 0.0;
	}
	
	public Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	public void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void move(Point that) {
		this.x = that.x;
		this.y = that.y;
	}
	
	public static void main(String[] args){
		Point thePoint = new Point();
		thePoint.move(X,Y);
		System.out.println("x =" + thePoint.x + ", y =" + thePoint.y);
	}

}
