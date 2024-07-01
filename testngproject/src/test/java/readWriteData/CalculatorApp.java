package readWriteData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculatorApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String filepath = System.getProperty("user.dir")+"\\TestData\\calc.xlsx";
		int totalrows = ExcelUtils.getRowCount(filepath, "Sheet1");
		int totalcols = ExcelUtils.getColCount(filepath, "Sheet1");
		
		
		for (int i=1; i<=totalrows; i++) {
			
			String  initialAmt = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String  time = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String  roi = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String  compounding = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String  finalAmt = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			System.out.println(finalAmt);
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(initialAmt);
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(time);
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(roi);
			driver.findElement(By.xpath("//span[@class='ng-tns-c109-4 ng-star-inserted']")).click();
			driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Compounded Monthly']")).click();
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			String finalVal = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			finalVal = finalVal.replaceAll("[$,]", "");
			System.out.println(finalVal);
			
			if(Double.parseDouble(finalAmt) == Double.parseDouble(finalVal)) {
				ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 6);
				//ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "Passed");
				
			}
			else {
				ExcelUtils.fillRedColor(filepath, "Sheet1", i, 6);
				//ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "Failed");
				
			}
			
		}
		
	}

}
