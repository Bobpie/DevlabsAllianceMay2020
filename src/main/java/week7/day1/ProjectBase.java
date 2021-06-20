package week7.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectBase {
	public ChromeDriver driver;
@BeforeMethod
public void beforeMethod() {
	System.out.println("**Before Method Started**");
	WebDriverManager.chromedriver().setup();
	// Create the new browser
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open6");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("**Before Method Ended**");
}
@AfterMethod
public void afterMethod() {
	System.out.println("**After Method Started**");
	driver.quit();
	System.out.println("**After Method Ended**");
}
}
