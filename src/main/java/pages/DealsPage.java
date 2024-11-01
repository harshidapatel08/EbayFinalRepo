package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DealsPage extends TestBase {
	@FindBy(id = "nav_29039")
	WebElement featured;
	
	@FindBy(linkText = "Great Deals on Holiday Decor")
	WebElement decorDeals;
	
	@FindBy(id = "nav_29040")
	WebElement tech;
	
	@FindBy(linkText = "iPhone, Android & Cell Phones")
	WebElement phoneLink;
	
	@FindBy(id = "gh-ac")
	WebElement searchBox;
	
	@FindBy(id = "gh-btn")
	WebElement searchBtn;
	
	@FindBy(linkText = "Deals")
	WebElement deals;
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyDealsPageTitle() {
		return driver.getTitle();
	}
	
	public boolean  verifyDeals() {
		deals.isDisplayed();
		return true;
	}
	
	public DealsPage hoverOnFeaturedLink() {
		Actions builder = new Actions(driver);
		builder.moveToElement(featured).build().perform();
		return new DealsPage();
	}
	
	public DealsPage clickOnDecorDeals() {
		decorDeals.click();
		return new DealsPage();
	}
	
	public DealsPage hoverOnlanguageLink() {
		Actions builder = new Actions(driver);
		builder.moveToElement(tech).build().perform();
		return new DealsPage();
	}
	
	public DealsPage clickOnPhoneLink() {
		phoneLink.click();
		return new DealsPage();
	}
	
	public void writeinSearchBox() {
		searchBox.sendKeys("iphone16");
		searchBtn.click();
	}
		
}
