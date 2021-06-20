package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC002_Create_Incident extends ProjectBase{
	@Test
	public void run_TC002() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Moa2QlQou0GO");
		driver.findElement(By.id("sysverb_login")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("filter")))).sendKeys("Incident");
		driver.findElement(By.xpath("(//span[text()='Incident']/following::div[text()='Create New'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys("Abel",Keys.TAB);
		driver.findElement(By.id("incident.short_description")).sendKeys("Test Description");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
	}
}
