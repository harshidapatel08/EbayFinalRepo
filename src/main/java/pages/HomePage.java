package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	private WebDriver driver;
	
	@FindBy(linkText = "eBay Deals")
	WebElement deals;
	
	@FindBy(linkText = "Help & Contact")
	WebElement helpAndContacts;
	
	@FindBy(linkText = "Current language English")
	WebElement languageLink;
	
	@FindBy(linkText = "Sell")
	WebElement sellLink;
	
	@FindBy(linkText = "Electronics")
	WebElement electronics;
	
	@FindBy(linkText = "Cameras & Photo")
	WebElement camerasAndPhotos;
	
	@FindBy(xpath = "//a[@aria-label='Your shopping cart']")
	WebElement addToCartBtn;
	
	@FindBy(id = "gh-logo")
	WebElement logo;
	
	@FindBy(id = "gh-shop-a")
	WebElement shopByCategories;
	
	@FindBy(id = "gh-ac")
	WebElement searchBox;
	
	@FindBy(id = "gh-cat")
	WebElement allCategories;
	
	@FindBy(id = "gh-btn")
	WebElement searchBtn;
	
	@FindBy(linkText = "Saved")
	WebElement saved;
	
	@FindBy(linkText = "Motors")
	WebElement motors;
	
	@FindBy(linkText = " eBay Deals")
	WebElement ebayDealsPage;
	
	@FindBy(linkText = "Collectibles")
	WebElement collectibles;
	
	@FindBy(linkText = "My eBay")
	WebElement myEbay;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public HelpAndContactsPage clickOnHelpAndContactsLink() throws IOException {
		helpAndContacts.click();
		return new HelpAndContactsPage();
	}
	
	public DealsPage clickOnDealsPageLink() {
		deals.click();
		return new DealsPage();
	}
	
	public void hoverOnlanguageLink() {
		Actions builder = new Actions(driver);
		builder.moveToElement(languageLink).build().perform();
	}
	
	public void writeinSearchBox() {
		searchBox.sendKeys("computers");
		searchBtn.click();
	}
	
	public void hoverOnMyEbay() {
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
	}
	
	public void clickOnCamerasAndPhotos() {
		camerasAndPhotos.click();
	}
}
