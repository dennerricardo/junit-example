package junitexample;

public class Account {
	
	private int accountId; 
	private int value;
	
	public Account(int accountId, int value) {
		this.accountId = accountId;
		this.value = value;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public int getValue() {
		return value;
	} 
	
	
}
