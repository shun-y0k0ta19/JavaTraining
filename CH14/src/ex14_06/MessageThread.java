package ex14_06;

public class MessageThread {
	private int elapsedTime = 0;
	
	public synchronized void showMessage15sec() throws InterruptedException{
		while(elapsedTime % 15 == 0 && elapsedTime != 0){
			wait();
			System.out.println("Elapsed 15 sec.");
		}
	}
	
	public synchronized void showMessage7sec() throws InterruptedException{
		while(elapsedTime % 7 == 0 && elapsedTime != 0){
			wait();
			System.out.println("Elapsed 7 sec.");
		}
	}
	
	public synchronized void notify1sec() throws InterruptedException{
		elapsedTime++;
		notifyAll();
	}
	
	public static void main(String[] args){
		final MessageThread messageThread = new MessageThread();
		
		Thread th1 = new Thread(){
			public void run(){
				try {
					while(true){
						messageThread.showMessage15sec();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread th2 = new Thread(){
			public void run(){
				try {
					while(true){
						messageThread.showMessage7sec();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread th3 = new Thread(){
			public void run(){
				try {
					while(true){
						messageThread.notify1sec();
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		th1.start();
		th2.start();
		th3.start();
	}
}
