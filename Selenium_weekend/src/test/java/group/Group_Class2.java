package group;

import org.testng.annotations.Test;

public class Group_Class2
{
	
	@Test(groups= {"smoke","sanity"})
	void test4()
	{
		System.out.println("Smoke Scenario 2");
	}
	@Test(groups = {"System"})
	void test5()
	{
		System.out.println("System Scenario 2");
	}
	@Test(groups = {"Sanity"})
	void test6()
	{
		System.out.println("sanity Scenario 2");
	}

}
