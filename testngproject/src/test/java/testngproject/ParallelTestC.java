package testngproject;

import org.testng.annotations.Test;

public class ParallelTestC {
	
	@Test(threadPoolSize = 2, invocationCount = 3, timeOut = 1000)
	public void testMethod1() {
		System.out.println("This is test method 1: "+ Thread.currentThread().getId());
	}
}
