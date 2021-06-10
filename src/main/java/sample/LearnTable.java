package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement table = driver.findElementById("table_id");
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	for (int i = 1; i < rows.size(); i++) {
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < cols.size(); j++) {
			System.out.print(cols.get(j).getText()+"\t");
		}
		System.out.println();
	}
	driver.quit();
	
}
}
