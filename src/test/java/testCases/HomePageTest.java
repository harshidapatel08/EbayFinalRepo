package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DealsPage;
import pages.HomePage;

public class HomePageTest extends TestBase {
    
    HomePage hp;
    DealsPage dp;
    TestBase tb;
    
    public HomePageTest() {
        super();
    }
    
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization(); // Call the initialization directly from the TestBase
        hp = new HomePage(tb.getDriver());
    }
    
    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = hp.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Electronics, Cars, Fashion, Collectibles & More | eBay", "Home page Title not matched");
    }
    
    @Test
    public void verifyUsernameTest() {
        hp.hoverOnMyEbay();
        hp.clickOnCamerasAndPhotos();
    }
    
    @Test
    public void writeInSearchBoxTest() {
        hp.writeinSearchBox();
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}