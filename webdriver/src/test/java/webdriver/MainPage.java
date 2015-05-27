package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends Page {

	public WebElement create;

	public WebElement chern;

	public WebElement sent;
	Params params;

	MainPage(WebDriver driver, Params params) {
		this.driver = driver;
		this.params = params;

	}

	public CreatePage goToCreate() {

		create = driver.findElement(params.createMessage);
		create.click();
		return new CreatePage(driver, params);

	}

	public ChernPage goToChern() {

		chern = driver.findElement(params.chernovik);
		chern.click();

		new WebDriverWait(driver, 15, 5000).until(ExpectedConditions
				.titleContains("Черновики"));

		return new ChernPage(driver, params);
	}

	public SentPage goToSent() {

		sent = driver.findElement(params.sentLink);
		sent.click();

		return new SentPage(driver, params);
	}

}
