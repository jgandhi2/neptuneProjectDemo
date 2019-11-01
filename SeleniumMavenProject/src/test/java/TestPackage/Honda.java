package TestPackage;

import org.testng.annotations.Test;

public class Honda extends Cars{
	
	@Test
	public void hondaPrice() {
		System.out.println("Honda class-->35,000");
	}
	@Test
	public void hondaDetails() {
		Honda h1= new Honda();
		h1.carEngine();
		h1.carFeatures();
		h1.carStyle();
		h1.carType();
		h1.hondaPrice();
		h1.hondaPrice1();
	//Top casting or dynamic or runtime polymorphism
	Cars c1= new Honda();
	c1.carEngine();
	c1.carFeatures();
	c1.carStyle();
	c1.carType();
	
	//Down casting is not permitted, will get java.lang.ClassCastException
	Honda d1=(Honda) new Cars();
	try {
	d1.carEngine();
	d1.carFeatures();
	d1.carStyle();
	d1.carType();
	d1.hondaPrice();
	d1.hondaPrice1();
	}
	catch(Exception e) {
	}
}
}