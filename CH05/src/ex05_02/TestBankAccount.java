package ex05_02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBankAccount {
	final int MAXHISTORY = 10;

	@Test
	public void test() {
		BankAccount ba = new BankAccount();
		assertNull(ba.history().next());
		
		for(int i = 0; i < MAXHISTORY; i++){
			ba.deposit(i * 100);
		}
		ba.history().show();
		
		ba.withdraw(300);
		ba.history().show();
	}

}
