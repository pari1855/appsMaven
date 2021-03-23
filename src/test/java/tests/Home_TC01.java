package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import utility.BaseClassGray;

public class Home_TC01 extends BaseClassGray {
	@BeforeTest
	public void driverSetUp() {
		try {
			driverInitialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void HomePage_TC1() {
		String URL= driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(URL);
		SoftAssert SA = new SoftAssert();
		SA.assertEquals(URL, "https://apps.appsmaventech.com/home1");
		SA.assertEquals(title, "Gray GaaS1");
		//Assert.assertEquals(URL, "https://apps.appsmaventech.com/home1");
		//Assert.assertEquals(title, "Gray GaaS1");
		
	}
	@Test
	public void HomePage_TC2() {
		System.out.println("Commiting into branches");
	}
	@Test
	public void setClipboard() {
		
	}

}
