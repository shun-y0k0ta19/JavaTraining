package ex14_04;


public class MultiThreadAdder2 {
	public static int data; 
	
	public static void addData(int num){
		data += num;
		System.out.println(Thread.currentThread().getName() + ": " + data);
	}
	
	public static void main(String[] args){
		
		Thread th1 = new Thread(){
			public void run(){
				try{
					while(true){
						MultiThreadAdder2.addData(1);
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
						MultiThreadAdder2.addData(10);
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
						MultiThreadAdder2.addData(100);
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
