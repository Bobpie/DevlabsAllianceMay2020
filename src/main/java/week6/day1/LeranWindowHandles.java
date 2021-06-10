package week6.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeranWindowHandles {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/window");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String baseWindow = driver.getWindowHandle();
	driver.findElementById("mye").click();
	
	Set<String> allWinRef = driver.getWindowHandles();
	for (String string : allWinRef) {
		driver.switchTo().window(string);
	
	}
	List<String> allWinList = new ArrayList<>(allWinRef);
	String secondWindow = allWinList.get(1);
	driver.switchTo().window(secondWindow);
	driver.manage().window().maximize();
	System.out.println(allWinRef.size());
	driver.close();
	
	// Switch back to the base window
	driver.switchTo().window(baseWindow);
	System.out.println(driver.getCurrentUrl());
	
	
}
}
