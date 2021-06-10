package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/aui");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	
	WebElement draggableElement = driver.findElement(By.id("draggable"));
	WebElement droppableElement = driver.findElement(By.id("droppable"));
	
	Actions builder = new Actions(driver);
	
	builder.dragAndDrop(draggableElement, droppableElement).perform();
	
	WebElement element1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
	WebElement element2 = driver.findElement(By.xpath("//ol[@id='selectable']/li[2]"));
	WebElement element3 = driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
	WebElement element4 = driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
	
	
	builder.keyDown(Keys.CONTROL).click(element1).click(element2)
	.click(element3).click(element4).keyUp(Keys.CONTROL).perform();
	
	
	
	
	
	
	
	
	
	
	

}
}
