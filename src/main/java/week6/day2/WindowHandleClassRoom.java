package week6.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleClassRoom {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open6");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
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
	driver.quit();
	
	
	
}
}
