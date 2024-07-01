package testngproject;

import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test(priority=1)
	public void test1() {
		System.out.println("This is the main test");
	}
	
	@Test(priority=2, dependsOnMethods = "test1")
	public void test2() {
		System.out.println("This test2 depends on test1");
	}

}
