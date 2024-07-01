package testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\eclipse-workspace\\chromedriver.exe");
		System.out.println("@BeforeClass");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("@AfterClass");
		driver.quit();
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getData(){
		return new Object[][] {
			{"Admin","admin123"},
			{"InvalidUser","InvalidPass"}
		};
	}
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		//driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
	}

}
