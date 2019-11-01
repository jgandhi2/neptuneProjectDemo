package TestPackage;

import org.testng.annotations.Test;

public class Cars {
	
		@Test
		public void carEngine() {
			System.out.println("Car class-->BMW V6 engine");	
		}
		@Test
		public void carType() {
			System.out.println("Car class-->BMW convertible");
		}
		@Test
		public void carStyle() {
			System.out.println("Car class-->Honda CR-V");
		}
		@Test
		public void carFeatures() {
			System.out.println("Car class-->Honda AWD");
		}
		@Test
		public void hondaPrice1() {
			System.out.println("Car class-->40,000");
		}
	}
