package week7.day2;

import org.testng.annotations.Test;

public class LearnAttributes {

	//@Test(testName="Create Incident",description = "This tc can create a new incident in Service now application")
	//@Test(enabled = false )
	//@Ignore
	// priority
	// invocationCount = 5
	//invocationTimeOut = 5000,invocationCount = 3
	//invocationCount = 10,threadPoolSize = 3
	//invocationCount = 5, timeOut = 15000
	@Test
	public void runTC002() {
		//System.out.println("TC002");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = {"week7.day1.LearnAttributes.runTC002"},alwaysRun = true)
	public void runTC001() {
		System.out.println("TC001");
	}
	@Test
	public void runTC003() {
		System.out.println("TC003");
	}
}
