package testngproject;

import org.testng.annotations.Test;

public class DescriptionTest {
	
	@Test(description = "This test has a description")
	public void descriptionTest() {
		System.out.println("Checking the description attribute");
	}

}
