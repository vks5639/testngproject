package testngproject;

import org.testng.annotations.Test;

public class ParallelTestB {
	
	@Test
	public void test3() {
		System.out.println("This is test method 3 of parallel test: " + Thread.currentThread().getId());
	}
	
	@Test
	public void test4() {
		System.out.println("This is test method 4 of parallel test: " + Thread.currentThread().getId());
	}
}
