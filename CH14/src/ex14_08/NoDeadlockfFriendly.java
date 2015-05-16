package ex14_08;

public class NoDeadlockfFriendly {
	private NoDeadlockfFriendly partner;
	private String name;
	
	public NoDeadlockfFriendly(String name){
		this.name = name;
	}
	
	public synchronized void hug(){
		System.out.println(Thread.currentThread().getName() +
				" in " + name + ".hug() trying to invoke " +
				partner.name + ".hugBack()");
		partner.hugBack();
	}
	
	private synchronized void hugBack(){
		System.out.println(Thread.currentThread().getName() +
				" in " + name + ".hugBack()");
	}
	
	public void becomeFriend(NoDeadlockfFriendly partner){
		this.partner = partner;
	}
	
	
	public static void main(String args[]){
		final NoDeadlockfFriendly jareth = new NoDeadlockfFriendly("jareth");
		final NoDeadlockfFriendly cory = new NoDeadlockfFriendly("cory");
		
		jareth.becomeFriend(cory);
		cory.becomeFriend(jareth);
		
		new Thread(new Runnable(){
			public void run(){
				jareth.hug();
			}
		}, "Thread1").start();
		
		new Thread(new Runnable(){
			public void run(){
				cory.hug();
			}
		}, "Thread2").start();
	}
}
/**
 * Deadlock 3/27 */
