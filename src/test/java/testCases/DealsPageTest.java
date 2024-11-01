package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DealsPage;
import pages.HelpAndContactsPage;
import pages.HomePage;

public class DealsPageTest extends TestBase{
	HomePage hp;
	TestBase testBase;
	HelpAndContactsPage helpAndContactsPage;
	DealsPage dp;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		testBase = new TestBase();
		testBase.initialization();
		hp = new HomePage(driver);
		dp = hp.clickOnDealsPageLink();
	}
	
	 @Test
	    public void verifyDealsPageTitleTest() throws InterruptedException {
		    Thread.sleep(3000);
	        String dealsPageTitle = dp.verifyDealsPageTitle();
	        Assert.assertEquals(dealsPageTitle, "Daily Deals on eBay | Best deals and Free Shipping");
	    }
	
	 @Test
 	    public void verifyDealsTest() throws IOException, InterruptedException{
		Assert.assertTrue(dp.verifyDeals(), "Deals is missing");
		Thread.sleep(2000);
	    }
	
	 @Test
	 public void verifySearchBox() {
		dp.writeinSearchBox();
	    } 
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
