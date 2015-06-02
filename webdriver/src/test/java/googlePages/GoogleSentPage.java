package googlePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSentPage {
	WebDriver driver;

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div[4]/div[1]/div/table/tbody/tr/td[6]/div/div/div/span[1]")
	public WebElement firstSent;

	@FindBy(xpath = ".//a[contains(@href,'me?tab')]")
	private WebElement exitMenu;

	@FindBy(xpath = ".//a[contains(@href,'logout')]")
	private WebElement exitButton;

	GoogleSentPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void gotoExit() {

		exitMenu.click();

		exitButton.click();

	}
}
