package yandexPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YandexMainPage  {
		
	WebDriver driver;
	
	@FindBy(xpath=".//a[contains(@href,'compose')]")
	public WebElement create;

	@FindBy(xpath=".//a[contains(@title,'Черновики')]")
	public WebElement chern;

	@FindBy(xpath=".//a[contains(@href,'sent')]")
	public WebElement sent;
	

	YandexMainPage(WebDriver driver) {
		this.driver = driver;
	
		PageFactory.initElements(driver, this);

	}

	public YandexCreatePage goToCreate() {

		
		create.click();
		return new YandexCreatePage(driver);

	}

	public YandexDraftsPage goToChern() {

		
		chern.click();

		new WebDriverWait(driver, 15, 5000).until(ExpectedConditions
				.titleContains("Черновики"));

		return new YandexDraftsPage(driver);
	}

	public YandexSentPage goToSent() {

		
		sent.click();

		return new YandexSentPage(driver);
	}

}
