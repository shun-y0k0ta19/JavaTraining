package ex01_14;

public class TwoJackWalkman extends Walkman{
	
	private String jack2;
	
	public TwoJackWalkman(){
		jack2 = super.GetJack();
	}
	
	public void Play(){
		super.Play();
		System.out.println("jack2: " + jack2);
	}
}
