package testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestB {
	
	@Test
	public void test3() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(false);
	}

}
