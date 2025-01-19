package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo
{
	@Parameters("browser")
	@Test
	public void test(String browser) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		if(browser.equals("chrome"))
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println("verification done1");
			Thread.sleep(10000);
			System.out.println(Thread.currentThread()+": current thread Id");
			driver.quit();
		}
		else
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			System.out.println("verification done2");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread()+": current thread Id");
			driver.quit();
		}
		WebDriver driver=null;
		Actions a=new Actions(driver);
		
		
		
		
	}
	
	
	
}
