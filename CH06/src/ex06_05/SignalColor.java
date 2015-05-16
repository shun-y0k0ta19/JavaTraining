package ex06_05;

public class SignalColor {
	enum Signal{
		RED("RED"){
			public String getColor(){
				return "RED";
			}
		},
		YELLOW("YELLOW"){
			public String getColor(){
				return "YELLOW";
			}
		},
		BLUE("BLUE"){
			public String getColor(){
				return "BLUE";
			}
		};
	
		Color color;
		Signal(String color){
			this.color = new Color(color);
		}
		
		abstract public String getColor();
	}
}
