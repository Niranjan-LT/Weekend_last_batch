package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvide_for_fb 
{
	@DataProvider(name="authentication")
	public Object[][] data()
	{
		return new Object[][]
				{
					{"admin","admin123"},
					{"adim123","selenium"},
					{"api","apache"}
				};		
	}
	
	@Test (dataProvider = "authentication")
	void test_fb(String un,String pwd)
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys(un);
		
		driver.findElement(By.name("pass")).sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
		wait.until(ExpectedConditions.titleContains("Log in to Facebook"));
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook","test failed");
		driver.quit();
		// bye
		
		
	}
	
	
	
	

}
