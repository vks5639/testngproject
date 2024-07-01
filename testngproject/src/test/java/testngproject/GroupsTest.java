package testngproject;

import org.testng.annotations.Test;

public class GroupsTest {
	
	@Test(groups = {"group1"})
	public void testGroup1() {
		System.out.println("Group 1 Test");
	}
	
	@Test(groups = {"group1"})
	public void testGroup1a(){
		System.out.println("Group 1 Test");
	}
	
	@Test(groups = {"group2"})
	public void testGroup2() {
		System.out.println("Group 2 Test");
	}

}
