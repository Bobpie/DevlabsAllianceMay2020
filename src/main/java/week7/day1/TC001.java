package week7.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

public class TC001 extends ProjectBase{
	@Test
	public void runTC001() throws IOException {
		System.out.println("**Testcase Started**");
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		// This creates a blank Img001.png file
		File destFile = new File("./snaps/Img001.png");
		FileUtils.copyFile(sourceFile, destFile);
		
		driver.switchTo().frame("iframeResult");
		File source2 = driver.findElementByXPath("//button[text()='Open Windows']").getScreenshotAs(OutputType.FILE);
		// This creates a blank Img001.png file
			File dest2 = new File("./snaps/Img002.png");
			FileUtils.copyFile(source2, dest2);
			System.out.println("**Testcase Ended**");

	}
}
