package testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void launchApp(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\eclipse-workspace\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Firefox Browser Tested");
			//System.setProperty("webdriver.gecko.driver", "");
			//driver = new FirefoxDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("IE Browser Tested");
			//System.setProperty("webdriver.ie.driver", "");
			//driver = new InternetExplorerDriver();
			
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}
