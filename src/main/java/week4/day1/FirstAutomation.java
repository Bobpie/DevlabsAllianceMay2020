package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
public static void main(String[] args) {

	// To establish environment between the system and the driver
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	// To open a browser, you need to create an object for the respective browser class
	ChromeDriver driver = new ChromeDriver();
	
	// To load the url into the automated browser
	driver.get("https://devlabs-860f0.web.app/");
	
	// To maximize the automated browser window
	driver.manage().window().maximize();
	
	
}
}
