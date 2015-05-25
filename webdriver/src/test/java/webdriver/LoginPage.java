package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
	
	
	public WebElement loginForm ;
	
	
	public WebElement passForm;
	
	
	public WebElement button;
	Params params;
	
	LoginPage(WebDriver driver, Params params){
		this.driver=driver;
		this.loginForm=driver.findElement(params.loginForm);
		this.passForm=driver.findElement(params.passForm);
		this.button=driver.findElement(params.loginButton);
		this.params=params;
		
	}

	
	public MainPage login(String login, String password){
		
		
		loginForm.sendKeys(login);
		passForm.sendKeys(password);
		button.click();
		return new MainPage(driver, params);
	}
}
