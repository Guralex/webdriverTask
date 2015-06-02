package iUaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IuaDraftsPage {
	
	private WebDriver driver;
	
	@FindBy(xpath=".//*[@id='mesgList']/form/div[1]/a/span[2]")
	public WebElement firstMail;
	
	@FindBy(xpath=".//*[@class='list_underlined']/li/a[contains(@href,'sent')]")
	public WebElement sentLink;

	IuaDraftsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		
	}

	public IuaCreatePage firstMail() {

		firstMail.click();
		return new IuaCreatePage(driver);
	}

	public IuaSentPage goToSent() {

		
		sentLink.click();

		return new IuaSentPage(driver);
	}

	
	

}
