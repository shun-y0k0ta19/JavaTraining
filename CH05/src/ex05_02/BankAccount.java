package ex05_02;

import java.util.LinkedList;

public class BankAccount {
	private long number;
	private long balance;
	private Action lastAct;
	private History history = new History();
	
	public class Action{
		private String act;
		private long amount;
		Action(String act, long amount){
			this.act = act;
			this.amount = amount;
		}
		public String toString(){
			return number + ": " + "balance: " + balance + ": " + act + " " + amount;
		}
	}
	
	public static class History{
		private LinkedList<Action> actList = new LinkedList<Action>();
		private final int MAXHISTORY = 10;
		private void add(Action act){
			if(actList.size() >= MAXHISTORY){
				actList.poll();
			}
			actList.add(act);
		}
		public Action next(){
			return actList.poll();
		}
		public History clone(){
			History hist = new History();
			hist.setActList(new LinkedList<Action>(actList));
			return hist;
		}
		public void show(){
			History hist = this.clone();
			try{
				for(int i = 0; i < MAXHISTORY; i++){
					System.out.println(hist.next().toString());
				}
			}
			catch(NullPointerException e){
				System.out.println("end");
			}

		}
		private void setActList(LinkedList<Action> actList){
			this.actList = actList;
		}
	}
	
	public void deposit(long amount){
		balance += amount;
		lastAct = new Action("deposit", amount);
		history.add(lastAct);
	}
	
	public void withdraw(long amount){
		balance -= amount;
		lastAct = new Action("withdraw", amount);
		history.add(lastAct);
	}
	
	public History history(){
		return history;
	}
}
