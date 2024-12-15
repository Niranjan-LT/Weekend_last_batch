package genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Genric_class implements Base_contant
{
	public WebDriver driver;
	@BeforeMethod
	public void open_app()
	{
		driver=WebDriverManager.chromedriver().create();
	   
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(pageLoad, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod
	public void close_app()
	{
		driver.quit();
	}
	// hello

}
