package ai.ds.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.io.FileHandler;

import ai.ds.testBase.TestBase;

public class UtilClass extends TestBase{
	
	
	public static void takeScreenShot(String filename) 
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
		
			String path="C:\\Users\\Uday Patil\\Desktop\\30July GitHub Session\\30JulyMBDalalStreet\\FrameworkDS\\screenshot\\";
			File dest=new File(path + filename + ".png");
		
			FileHandler.copy(src, dest);
			System.out.println("Take a screenshot");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" Get exception like file not found");
			
		}
	}

}
