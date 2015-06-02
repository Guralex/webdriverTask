package iUaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IuaLoginPage {
	
	WebDriver driver;
	
	

	
	@FindBy(name="login")
	public WebElement loginForm;

	@FindBy(name="pass")
	public WebElement passForm;
	
	@FindBy(xpath=".//*[@class='list_cols_2 clear']/li[2]/input")
	public WebElement button;

	

	public IuaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

		

	}

	

	public IuaMainPage login(String login, String password) {


		loginForm.sendKeys(login);
		passForm.sendKeys(password);
		button.click();
		return new IuaMainPage(driver);

	}
}
