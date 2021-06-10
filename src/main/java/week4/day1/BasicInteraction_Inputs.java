package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicInteraction_Inputs {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/edit");
	driver.manage().window().maximize();
	
	// Find the textbox -> First & Last Name Text Box
	WebElement fullName = driver.findElementById("fullName");
	fullName.sendKeys("Devlabs");
	
	WebElement join = driver.findElementById("join");
	join.sendKeys("Boy",Keys.TAB);
	
	WebElement retrieve = driver.findElementById("getMe");
	String attribute = retrieve.getAttribute("value");
	System.out.println(attribute);
	
	driver.findElementById("clearMe").clear();
	
	boolean enabled = driver.findElementById("noEdit").isEnabled();
	if(enabled) {
		System.out.println("The field is enabled");
	}
	else
	{
		System.out.println("The Field is disabled");
	}
	
	
	
	
	
	
	
	
	
}
}
