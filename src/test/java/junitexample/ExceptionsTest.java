package junitexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
	
	@Test
	void userTranferValidationException(){
		Account  acc1  = new Account(1234, 0);
		Account  acc2  = new Account(3435, 100);
		
		AccountTransfer accTrf= new AccountTransfer();
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->
			accTrf.tranferValue(acc1, acc2, -1));
	}
}
