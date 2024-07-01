package testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestA {
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}

}
