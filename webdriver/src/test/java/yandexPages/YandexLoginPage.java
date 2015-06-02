package yandexPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexLoginPage {
	
	WebDriver driver;
	
	

	
	@FindBy(name="login")
	public WebElement loginForm;

	@FindBy(name="passwd")
	public WebElement passForm;
	
	@FindBy(xpath="//button/span[@class='_nb-button-content']")
	public WebElement button;

	

	public YandexLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

		

	}

	

	public YandexMainPage login(String login, String password) {


		loginForm.sendKeys(login);
		passForm.sendKeys(password);
		button.click();
		return new YandexMainPage(driver);

	}
}
