package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClassGray {
		public static WebDriver driver;	
			public static WebDriver driverInitialization() throws Exception {
				//Properties prop = new Properties();
				//File file = new File("C:\\Users\\Admin\\eclipse-workspace\\HelloWorld\\com.AppsMaven\\prop.properties");
				//FileInputStream fis =new FileInputStream(file);
				//prop.load(fis);
				WebDriverManager.chromedriver().version("70.0.3538.16/").arch32().setup();
				driver = new ChromeDriver();
				//String BrowserName= prop.getProperty("browser");
				//System.out.println(BrowserName);
				driver.get("https://apps.appsmaventech.com/home");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
		}
	}
