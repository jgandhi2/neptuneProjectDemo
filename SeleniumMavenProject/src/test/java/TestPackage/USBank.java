package TestPackage;

import org.testng.annotations.Test;
	
	@Test
	public interface USBank {

		int minBal=100;
		int fdicLimit=100000;
		
		public void custDetails();
		
		public void acctDetails();
	}

