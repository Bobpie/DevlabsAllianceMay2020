package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDowns {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/dropdown");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// Find the Drop down Select tag and store it
	WebElement elementDropDown = driver.findElementById("Index");
	// Create an object for the Select Class and pass the webelement as Parameter in the Constructor
	
	Thread.sleep(5000);
	elementDropDown.sendKeys("Orange");
	
	
	Select dd = new Select(elementDropDown);
	// Selecting the options in the drop down
	// Type - 1 -> Selecting using the index
	// dd.selectByIndex(2);
	
	// Type - 2 -> Selecting using the visible text
	// dd.selectByVisibleText("Orange");
	
	// Type - 3 -> Selecting using the value
	// dd.selectByValue("1");
	
	List<WebElement> options = dd.getOptions();
	int size = options.size();
	System.out.println(size);
	
	dd.selectByVisibleText(options.get(size-1).getText());
	for (WebElement eachElement : options) {
		System.out.println(eachElement.getText());
	}
	
}
}
