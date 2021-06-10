package week6.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTakeSnap {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open6");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	File sourceFile = driver.getScreenshotAs(OutputType.FILE);
	// This creates a blank Img001.png file
	File destFile = new File("./snaps/Img001.png");
	FileUtils.copyFile(sourceFile, destFile);
	
	driver.switchTo().frame("iframeResult");
	File source2 = driver.findElementByXPath("//button[text()='Open Windows']").getScreenshotAs(OutputType.FILE);
	// This creates a blank Img001.png file
		File dest2 = new File("./snaps/Img002.png");
		FileUtils.copyFile(source2, dest2);
	
}
}
