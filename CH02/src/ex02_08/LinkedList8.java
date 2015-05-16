package ex02_08;

public class LinkedList8 {
	public Vehicle vehicle;
	public LinkedList8 nextlist;
	
	public LinkedList8(){
	}

	public LinkedList8(Vehicle vc){
		this.vehicle = vc;
	}

	public static void main(String[] args) {
		Vehicle vc1 = new Vehicle();
		Vehicle vc2 = new Vehicle();
		vc1.Set(100, 100, "Jack");
		vc2.Set(200, 200, "Rick");
		
		LinkedList8 l1 = new LinkedList8();
		LinkedList8 l2 = new LinkedList8(vc2);
		
		l1.vehicle = vc1;
		l1.nextlist = l2;
		
		l2.nextlist = null;
		
		//Test
		vc1.Show();
		vc2.Show();
		System.out.println(l1.vehicle + " " + l1.nextlist);
		System.out.println(l2 + " " + l2.vehicle + " " + l2.nextlist);		
	}

}
