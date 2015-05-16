package ex10_05;

public class TwoChar {
	public void showBetweenTwoChar(char start, char end)
	{
		if(start > end)
		{
			char tmp = end;
			end = start;
			start = tmp;
		}
		for(; start <= end; start++)
		{
			System.out.print(start);
		}
	}
	
	public static void main(String[] args)
	{
		TwoChar twoChar = new TwoChar();
		twoChar.showBetweenTwoChar('A', 'z');
	}
}
