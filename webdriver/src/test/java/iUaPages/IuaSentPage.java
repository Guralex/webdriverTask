package iUaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IuaSentPage  {
	WebDriver driver;
	
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div[2]/div[2]/div[2]/form/div/a/span[2]")
	public WebElement firstSent;
	
	@FindBy(xpath=".//*[@title='Настройки']")
	private WebElement exitMenu;
	
	@FindBy(xpath=".//*[contains(@href,'logout')]")
	private WebElement exitButton;

	IuaSentPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void gotoExit() {
	
		exitMenu.click();
	
		exitButton.click();

	}
}
