
package genric;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Check_Anotation
{
	@BeforeSuite
	void bf()
	{
		System.out.println("before suite");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("before Class");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("before test");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("before Method");
	}
	@AfterSuite
	void af()
	{
		System.out.println("after suite");
	}
	@AfterClass
	void ac()
	{
		System.out.println("after class");
	}
	@AfterTest
	void at()
	{
		System.out.println("after test");
	}
	@AfterMethod
	void am()
	{
		System.out.println("after method");
	}
	

}
