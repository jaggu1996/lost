package Test2;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"test has started");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"test has fail");
		
	}
   public void OnTestSuccess(ITestResult result) {
	   System.out.println(result.getName()+"test success");
	   
   }
   public void OnTestSkipped(ITestResult result) {
	   System.out.println("test skipped");
   }
}


