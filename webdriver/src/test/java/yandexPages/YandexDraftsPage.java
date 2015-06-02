package yandexPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexDraftsPage {
	
	private WebDriver driver;
	
	@FindBy(xpath=".//*[@id='js-page']/div/div[5]/div/div[3]/div/div[3]/div/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/span[2]/span/a/span[2]/span/span")
	public WebElement firstMail;
	
	@FindBy(xpath=".//a[contains(@href,'sent')]")
	public WebElement sentLink;

	YandexDraftsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		
	}

	public YandexCreatePage firstMail() {

		firstMail.click();
		return new YandexCreatePage(driver);
	}

	public YandexSentPage goToSent() {

		
		sentLink.click();

		return new YandexSentPage(driver);
	}

	
	

}
