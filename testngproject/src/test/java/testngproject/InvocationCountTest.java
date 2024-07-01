package testngproject;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount = 3)
	public void test1() {
		System.out.println("This test will run three times. Wohoooo");
	}
}
