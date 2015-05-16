package ex02_06;

public class LinkedListMain {
	public Vehicle vehicle;
	public LinkedListMain nextlist;
	

	public static void main(String[] args) {
		Vehicle vc1 = new Vehicle();
		Vehicle vc2 = new Vehicle();
		vc1.Set(100, 100, "Jack");
		vc2.Set(200, 200, "Rick");
		
		LinkedListMain l1 = new LinkedListMain();
		LinkedListMain l2 = new LinkedListMain();
		
		l1.vehicle = vc1;
		l1.nextlist = l2;
		
		l2.vehicle = vc2;
		l2.nextlist = null;
		
		//Test
		vc1.Show();
		vc2.Show();
		System.out.println(l1.vehicle + " " + l1.nextlist);
		System.out.println(l2 + " " + l2.vehicle + " " + l2.nextlist);		
	}

}
