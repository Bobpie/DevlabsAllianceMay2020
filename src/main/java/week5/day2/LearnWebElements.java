package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 12",Keys.ENTER);
	
	List<WebElement> element_allMobileNames = driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");
	for (WebElement eachElement : element_allMobileNames) {
		System.out.println(eachElement.getText().startsWith("A"));
	}



}
}
