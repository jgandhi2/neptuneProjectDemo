package TestPackage;

import org.testng.annotations.Test;

public class TestBank {
	
	@Test
	public void testBank() {
		ValleyBank vb=new ValleyBank();
		vb.acctBal();
		vb.acctDetails();
		vb.custDetails();
		System.out.println(USBank.minBal);
		System.out.println(USBank.fdicLimit);
		vb.creditCard();
		vb.debitCard();
		vb.onlineTransaction();
	}

}

