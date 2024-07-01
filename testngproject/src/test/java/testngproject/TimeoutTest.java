package testngproject;

import org.testng.annotations.Test;

public class TimeoutTest {
	
	@Test(timeOut=5000)
	public void timeoutTest() throws InterruptedException {
		System.out.println("This test has a timeout of 5s");
		Thread.sleep(6000);
	}

}
