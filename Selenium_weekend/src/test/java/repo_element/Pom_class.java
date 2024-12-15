package repo_element;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom_class 
{
	@FindBy(name = "login")
	private List<WebElement> Login;
	
		public Pom_class(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	public List<WebElement>  LoginButton()
	{
		return  Login;
	}
	
	
	

}
