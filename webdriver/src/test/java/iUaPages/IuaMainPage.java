package iUaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IuaMainPage  {
		
	WebDriver driver;
	
	@FindBy(xpath="//p[@class='make_message']/a")
	public WebElement create;

	@FindBy(xpath=".//*[@class='list_underlined']/li/a[contains(@href,'drafts')]")
	public WebElement chern;

	@FindBy(xpath=".//*[@class='list_underlined']/li/a[contains(@href,'sent')]")
	public WebElement sent;
	

	IuaMainPage(WebDriver driver) {
		this.driver = driver;
	
		PageFactory.initElements(driver, this);

	}

	public IuaCreatePage goToCreate() {

		
		create.click();
		return new IuaCreatePage(driver);

	}

	public IuaDraftsPage goToChern() {

		
		chern.click();

		new WebDriverWait(driver, 15, 5000).until(ExpectedConditions
				.titleContains("Черновики"));

		return new IuaDraftsPage(driver);
	}

	public IuaSentPage goToSent() {

		
		sent.click();

		return new IuaSentPage(driver);
	}

}
