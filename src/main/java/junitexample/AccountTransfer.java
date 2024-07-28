package junitexample;

public class AccountTransfer {
	public void tranferValue(Account acc1, Account acc2, int value) {
		if(value<=0) {
			throw new IllegalArgumentException("value needs to be more than zero");
		}

	}
}