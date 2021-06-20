package week7.day1;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

public class TC002 extends ProjectBase{
	@Test
	public void runTC002() {	
		System.out.println("**Testcase Started**");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Open Windows']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String eachWindow : windowHandles) {
			driver.switchTo().window(eachWindow);
			if(driver.getTitle().equals("Google")) {
				System.out.println(driver.getCurrentUrl());
				driver.close();
				break;
			}
		}
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println("**Testcase ended**");
	}
}
