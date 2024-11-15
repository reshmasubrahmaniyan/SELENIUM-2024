package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.Status;

public class ListernerUtility extends BaseClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
     test = extReport.createTest(result.getName());
}
	@Override
public void onTestFailure(ITestResult result ) {
	
	test.log(Status.FAIL,result.getName()+" is failed");
	TakesScreenshot ts=(TakesScreenshot) sdriver;
	test.addVideoFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
	
	//add screenshot in screenshot folder
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+result.getName()+jUtil.getSystemTime()+".png");
	
	try {
		FileHandler.copy(dest,temp)

	}catch(IOException e) {
	e.printStackTrace();
	}
	
}}
