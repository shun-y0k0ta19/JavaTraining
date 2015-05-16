package ex14_05;


public class MultiThreadAdder3 {
	private int data = 0;
	
	public synchronized void addData(int num){
		data += num;
		System.out.println(Thread.currentThread().getName() + ": " + data);
	}
	
	public static void main(String[] args){
		final MultiThreadAdder3 adder = new MultiThreadAdder3();
		
		Thread th1 = new Thread(){
			public void run(){
				try{
					while(true){
						adder.addData(1);
						Thread.sleep(1000);
					}
				}
				catch(InterruptedException e){
					return;
				}
			}
		};
		
		Thread th10 = new Thread(){
			public void run(){
				try{
					while(true){
						adder.addData(10);
						Thread.sleep(1000);
					}
				}
				catch(InterruptedException e){
					return;
				}
			}
		};

		Thread th100 = new Thread(){
			public void run(){
				try{
					while(true){
						adder.addData(100);
						Thread.sleep(1000);
					}
				}
				catch(InterruptedException e){
					return;
				}
			}
		};
		
		th1.start();
		th10.start();
		th100.start();
	}
}
