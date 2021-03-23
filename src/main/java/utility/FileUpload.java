package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload extends BaseClassGray{
	@BeforeTest
	public void setUp() throws Exception {
		driverInitialization();
	}

	public static void setClipboardData(String string) {
		StringSelection ss = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	}
	
	public static void uploadFile(String EnterFilePath) throws AWTException {
		setClipboardData(EnterFilePath);
		Robot rb = new Robot();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		rb.waitForIdle();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
		@Test
		public void fileUpload()throws AWTException {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/test/upload/");
			driver.findElement(By.name("uploadfile_0")).click();
			FileUpload.uploadFile("C:\\Users\\Admin\\Pictures\\AMAL30.PNG");
			driver.findElement(By.id("terms")).click();
			Boolean status = driver.findElement(By.id("terms")).isSelected();
			System.out.println(status);
			driver.findElement(By.id("submitbutton")).click();
			
			
	}
	
}
