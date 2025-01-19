package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestL implements ITestListener
{
	public void onTestSuccess(ITestResult result) {
		System.out.println(" ----test Success---");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("---test failute--- take ScreenShot");
		System.out.println(result.getName()+"---"+result.getMethod());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("----Skip testcase ----");
		System.out.println(result.getMethod());
	}

	public void onStart(ITestResult context) {
		System.out.println("---on start--- testcase started---" );
	}
	public void onFinish(ITestResult context) {
		System.out.println("----on Finish----");
		
	}
	

}
