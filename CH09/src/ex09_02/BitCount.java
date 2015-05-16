package ex09_02;

public class BitCount {
	
	public int bitCount(int num)
	{
		int count = 0;
		while(num != 0)
		{
			num &= num -1;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int num = 0xff;
		BitCount bitcount = new BitCount();
		System.out.println(bitcount.bitCount(num));
	}
}
