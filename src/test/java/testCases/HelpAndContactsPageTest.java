package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HelpAndContactsPage;
import pages.HomePage;

public class HelpAndContactsPageTest extends TestBase{
	HomePage hp;
	TestBase testBase;
	HelpAndContactsPage helpAndContactsPage;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		testBase = new TestBase();
		testBase.initialization();
		hp = new HomePage(driver);
		helpAndContactsPage = hp.clickOnHelpAndContactsLink();
	}
	
	@Test
	public void verifyebayLogoTest() throws IOException, InterruptedException{
		Assert.assertTrue(helpAndContactsPage.verifyEbayLogo(), "EbayLogo is missing");
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyCustomerServiceTitleTest() {
		Assert.assertTrue(helpAndContactsPage.verifyCustomerServiceTitle(), "Customer Service Title is Missing");
	}
	
	@Test
	public void verifysrTitleTest() {
		Assert.assertTrue(helpAndContactsPage.verifysrTitle(), "sr Title is missing");
	} 
	
	@Test
	public void searchBoxAndSearchBtnTest() throws InterruptedException {
		Thread.sleep(20000);
		helpAndContactsPage.writeInSearchBox();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
