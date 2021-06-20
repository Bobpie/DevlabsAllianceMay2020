package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_Login_Logout extends ProjectBase {
	@BeforeTest
	public void setData() {
		excelfilePath = "./testdata/TC001.xlsx";
	}
	
	@Test(dataProvider = "sendTestData")
	public void run_TC001(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("user_info_dropdown")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout")))).click();
		
		
	}

}
