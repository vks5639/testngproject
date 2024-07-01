package testngproject;

import org.testng.annotations.Test;

public class EnabledTest {
	
	@Test(enabled = false)
	public void testDisabled() {
		System.out.println("This test is disabled");
	}

}
