package ai.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.pageLayer.LoginPage;
import ai.ds.testBase.TestBase;

public class TestClass extends TestBase {
	
	
	
	@Test(priority=1)
	public void verifyLoginTest() throws InterruptedException
	{
		//---object creation---//
		LoginPage lp= new LoginPage();
		
		
		//-----action methods-----//
		lp.enterEmailID("amarwaghmare573@gmail.com");
		lp.enterPassword("Test@1234");
		lp.clickOnLoginButton();
		Thread.sleep(4000);
		
		String expected_url="https://apps.dalalstreet.ai/dashboard";
		String actual_url=driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
		System.out.println("successfully created");
		System.out.println("successfully created");
		
	}
//	
//	@Test(priority=2)
//	public void verifyBuyFunctionality()
//	{
//		
//	}

}
