package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomTest {
	
	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//PomType1 pt = new PomType1(driver);
		PomType2 pt = new PomType2(driver);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		pt.setUsername("Admin");
		pt.setPassword("admin123");
		pt.clickLogin();
		
	}

}
