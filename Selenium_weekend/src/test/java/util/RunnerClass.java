package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass
{
	@Test(priority = 1)
	void test()
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("tescase pass");
	}
	@Test(priority = 2)
	void test1()
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		System.out.println("tescase pass");
	}

}
