package TestPackage;

import org.testng.annotations.Test;
// Modified code for review
public class ValleyBank implements USBank,PNCBank{
	@Test
	public void custDetails() {
		System.out.println("Customer name::    Jayendra");
		System.out.println("Customer address:: 121 Broad Street, Passaic,NJ 07055");
	}
	@Test
	public void acctDetails() {
		System.out.println("Account number::   12345");
	}
	@Test
	public double acctBal() {
		double acctBal=5750.75;
		return acctBal;
	}
	@Test
	public void creditCard() {
		System.out.println("Credit card limit::10,000 USD");	
	}
	@Test
	public void debitCard() {
		System.out.println("Debit card fees:: 5 USD");
		
	}
	@Test
	public void onlineTransaction() {
		System.out.println("Maximum daily online withdrawal::5,000 USD");
		
	}
}
