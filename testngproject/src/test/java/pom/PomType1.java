package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomType1 {
	
	WebDriver driver;
	
	By uname = By.name("username");
	By pswd = By.name("password");
	By login = By.cssSelector("button[type='submit']");
	
	public PomType1(WebDriver d) {
		this.driver=d;
	}
	
	public void setUsername(String name) {
		driver.findElement(uname).sendKeys(name);
	}
	
	public void setPassword(String password) {
		driver.findElement(pswd).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();;
	}

}
