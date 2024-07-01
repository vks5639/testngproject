package testngproject;

import org.testng.annotations.Test;

public class ParallelTestA {
	
	@Test
	public void test1() {
		System.out.println("This is test method 1 of parallel test: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("This is test method 2 of parallel test: "+ Thread.currentThread().getId());
	}

}
