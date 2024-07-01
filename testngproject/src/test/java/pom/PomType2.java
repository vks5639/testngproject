package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PomType2 {
	
	WebDriver driver;
	
	/*
	 * @FindBy(how=How.NAME, using="username") WebElement uname;
	 * 
	 * @FindBy(how=How.NAME, using="password") WebElement pswd;
	 * 
	 * @FindBy(how=How.CSS, using="button[type='submit']") WebElement login;
	 */
	
	@FindBy(name = "username") WebElement uname;
	@FindBy(name = "password") WebElement pswd;
	@FindBy(css = "button[type='submit']") WebElement login;
	
	public PomType2(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setUsername(String name) {
		uname.sendKeys(name);
	}
	
	public void setPassword(String password) {
		pswd.sendKeys(password);
	}
	
	public void clickLogin() {
		login.click();
	}

}
