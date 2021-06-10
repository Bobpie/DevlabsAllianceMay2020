package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/table");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement element_Table = driver.findElement(By.id("table"));
	List<WebElement> elements_Rows = element_Table.findElements(By.tagName("tr"));
	for (int i = 1; i < elements_Rows.size(); i++) {
		List<WebElement> elements_Data = elements_Rows.get(i).findElements(By.tagName("td"));
		System.out.println(elements_Data.get(0).getText());
	}
	
	
	
	
	
	
	for (WebElement element_eachRow : elements_Rows) {
		List<WebElement> elements_EachData = element_eachRow.findElements(By.tagName("td"));
		for (WebElement element_EachData : elements_EachData) {
			System.out.println(element_EachData.getText());
		}
	}
}
}
