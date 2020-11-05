package kycTestJob;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setup {
static WebDriver driver;

	@Test
	public void launch() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","/home/malleshd/Downloads/chromedriver");
		//ExcelDataConfig excel = new ExcelDataConfig("C:\\kyc data\\kyc.xlsx");
			
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://dashboard.stage.kychub.com/login");

}
}
