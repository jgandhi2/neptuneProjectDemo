package TestPackage;

import org.testng.annotations.Test;

@Test
public interface PNCBank {
	int minBal=500;
	int fdicLimit=50000;
	
	public void creditCard();
	public void debitCard();
	public void onlineTransaction();

}
