package testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunTest {
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Failing this test");
		Assert.fail("Failing this test on purpose");
	}
	
	@Test(priority=2, dependsOnMethods = "test1", alwaysRun = true)
	public void test2() {
		System.out.println("This test will always run");
	}
		
	

}
