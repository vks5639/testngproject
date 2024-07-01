package testngproject;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=1)
	public void test1() {
		System.out.println("test1 has a priority 1");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("test2 has a priority 2");
	}

}
