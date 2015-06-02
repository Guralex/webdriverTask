package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SentPage extends Page {
	Params params;
	public WebElement firstSent;
	private WebElement exitMenu;
	private WebElement exitButton;

	SentPage(WebDriver driver, Params par) {
		this.driver = driver;
		this.params = par;
		firstSent = driver.findElement(params.firstSent);
	}

	public void gotoExit() {
		exitMenu = driver.findElement(params.exitMenu);
		exitMenu.click();
		exitButton = driver.findElement(params.exitButton);
		exitButton.click();

	}
}
