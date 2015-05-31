
public class Array {

	public void test(){
		int[] a = new int[5];
		int[] b = null;
		if(b == null){
			System.out.println("b = null");
		}
		//System.out.println(b);
		for(int n : a){
			System.out.print(n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array arr = new Array();
		arr.test();
	}

}
