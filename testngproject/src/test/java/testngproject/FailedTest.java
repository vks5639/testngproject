package testngproject;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class FailedTest {
	
	@AfterTest
	public void runFailedTests() {
		TestNG obj = new TestNG();
		
		List<String> newlist = new ArrayList<String>();
		
		newlist.add("C:\\Users\\vikas\\eclipse-workspace\\testngproject\\test-output\\testng-failed.xml");
		
		obj.setTestSuites(newlist);
		
		obj.run();
	}
	
}
