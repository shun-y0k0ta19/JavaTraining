package ex01_14;

public class Walkman {

	private String jack;
	
	public Walkman(){
		jack = "When the night has come ...";	//set music output from jack
	}
	
	public void Play(){
		System.out.println("jack1: " + jack);		//outputs music
	}
	
	public String GetJack(){
		return jack;
	}
	
	public static void main(String[] args) {
		Walkman wm = new Walkman();
		wm.Play();
		
		TwoJackWalkman tjwm = new TwoJackWalkman();
		tjwm.Play();
	}

}
