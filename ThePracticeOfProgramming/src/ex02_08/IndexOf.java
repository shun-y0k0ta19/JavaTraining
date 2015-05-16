package ex02_08;

public class IndexOf {
	String str = "abcdejghijklmn";
	
	void useIndexOf(){
		int res1 = str.indexOf("de");
		int res2 = str.indexOf('h');
		int res3 = str.indexOf("aldfj");
		System.out.println("res1 = " + res1 + ", res2 = " + res2 + ", res3 = " + res3);
	}
	
	public static void main(String[] args) {
		IndexOf indexOf = new IndexOf();
		indexOf.useIndexOf();
	}

}
