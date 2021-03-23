package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import utility.BaseClassGray;

public class HomePage extends BaseClassGray {
	
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
		System.out.println(URL);
		Assertion sa = new SoftAssert();
		sa.assertEquals(URL, "https://apps.appsmaventech.com/home1");
		String title = driver.getTitle();
		sa.assertEquals(title, "Gray GaaS1");
	}
	@Test
	public void HomePage_TC2() {
	}

}
