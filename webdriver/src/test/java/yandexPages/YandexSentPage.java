package yandexPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexSentPage  {
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='js-page']/div/div[5]/div/div[3]/div/div[3]/div/div/div/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/span[2]/span/a/span[1]/span/span[2]")
	public WebElement firstSent;
	
	@FindBy(xpath="//a[@id='nb-1']")
	private WebElement exitMenu;
	
	@FindBy(xpath=".//a[contains(@href,'logout')]")
	private WebElement exitButton;

	YandexSentPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void gotoExit() {
	
		exitMenu.click();
	
		exitButton.click();

	}
}
