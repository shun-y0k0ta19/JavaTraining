package ex06_04;

public class SignalColor {
	enum Signal{
		RED("RED"),
		YELLOW("YELLOW"),
		BLUE("BLUE");
	
		Color color;
		Signal(String color){
			this.color = new Color(color);
		}
		
		public Color getColor(){
			return color;
		}
	}
}
