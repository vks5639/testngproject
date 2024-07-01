package testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	WebDriver driver;
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\eclipse-workspace\\chromedriver.exe");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void afterClasss() {
		System.out.println("@AfterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("@BeforeMethod");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
		driver.quit();
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		System.out.println("test Login");
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.tagName("button"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed());
	}
	
	@Test
	public void testInvalidLogin() throws InterruptedException {
		System.out.println("testInvalidLogin");
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));
        
        username.sendKeys("InvalidUser");
        password.sendKeys("invalidPass");
        loginButton.click();
        Thread.sleep(3000);
        
        WebElement errorMessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        Assert.assertTrue(errorMessage.isDisplayed());
	}
	
}
