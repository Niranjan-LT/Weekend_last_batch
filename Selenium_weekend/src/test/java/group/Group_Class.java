package group;

import org.testng.annotations.Test;

public class Group_Class
{
	
	@Test(groups ={"smoke"})
	void test1()
	{
		System.out.println("Smoke Scenario 1");
	}
	@Test(groups =  {"System"})
	void test2()
	{
		System.out.println("System Scenario 2");
	}
	@Test(groups = {"sanity",})
	void test3()
	{
		System.out.println("sanity Scenario 3");
	}

}
