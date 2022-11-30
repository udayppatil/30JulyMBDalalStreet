package ai.ds.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" Testcase execution is started : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(" Testcase execution is completed : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" Testcase execution is failed : " + result.getName());
		System.out.println("take a screenshot");
		UtilClass.takeScreenShot(result.getName() + System.currentTimeMillis());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" Testcase execution is skipped : " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

}
