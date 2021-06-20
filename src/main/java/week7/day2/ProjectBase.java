package week7.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectBase {
public RemoteWebDriver driver;
public String excelfilePath;
@Parameters({"url","browser"})
@BeforeMethod
public void beforeMethod_login(String url,String browser) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@AfterMethod
public void afterMethod_logout() {
	driver.quit();
}
@DataProvider
public String[][] sendTestData() throws IOException {
	String[][] data = Util_ReadExcel.getExcelData(excelfilePath);
	return data;
}
}
