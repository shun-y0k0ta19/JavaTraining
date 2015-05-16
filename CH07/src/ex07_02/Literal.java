package ex07_02;

public class Literal {
	private static boolean bl;
	private static char ch;
	private static byte bt;
	private static short sh;
	private static int num;
	private static long lng;
	private static float fl;
	private static double db;	
	
	public static void main(String[] args) {
		bl = false;
		//ch = false;
		//bt = false;
		//sh = false;
		//num = false;
		//lng = false;
		//fl = false;
		//db = false;

		show();
		
		//bl = 0x10;
		ch = 0x10;
		bt = 0x10;
		sh = 0x10;
		num = 0x10;
		lng = 0x10;
		fl = 0x10;
		db = 0x10;
		
		show();
		
		//bl = 2;
		ch = 2;
		bt = 2;
		sh = 2;
		num = 2;
		lng = 2;
		fl = 2;
		db = 2;
		
		show();
		
		//bl = -1;
		//ch = -1;
		bt = -1;
		sh = -1;
		num = -1;
		lng = -1;
		fl = -1;
		db = -1;

		show();
		
		//bl = 'a';
		ch = 'a';
		bt = 'a';
		sh = 'a';
		num = 'a';
		lng = 'a';
		fl = 'a';
		db = 'a';

		show();
		
		//bl = 3.5f;
		//ch = 3.5f;
		//bt = 3.5f;
		//sh = 3.5f;
		//num = 3.5f;
		//lng = 3.5f;
		fl = 3.5f;
		db = 3.5f;

		show();
		
		//bl = 3.5;
		//ch = 3.5;
		//bt = 3.5;
		//sh = 3.5;
		//num = 3.5;
		//lng = 3.5;
		//fl = 3.5;
		db = 3.5;
		
		show();
		
	}
	
	public static void show()
	{
		System.out.println("bl:" + bl);
		System.out.println("ch:" + ch);
		System.out.println("bt:" + bt);
		System.out.println("sh:" + sh);
		System.out.println("num:" + num);
		System.out.println("lng:" + lng);
		System.out.println("fl:" + fl);
		System.out.println("db:" + db);
		System.out.printf("%n");

	}

}
