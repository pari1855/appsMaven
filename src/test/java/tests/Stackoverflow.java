package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;
import utility.BaseClassGray;

public class Stackoverflow extends BaseClassGray {

	@BeforeMethod
	public void setup() {
		try {
		driverInitialization();
	}
		catch(Exception e) {
			
		}
	}
	
	@Test(invocationCount = 3, threadPoolSize = 3)
	public void stack() throws AWTException, Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("568567546754");
		Robot ab = new Robot();
		Thread.sleep(1000);
		ab.keyPress(KeyEvent.VK_ENTER);	
		}

}
