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
		
		this.params=params;
		
	}

	
	public MainPage login(String login, String password){
		
		if(params.type.equals("google")){
			this.loginForm=driver.findElement(params.loginForm);
			this.button=driver.findElement(params.loginButton);
			loginForm.sendKeys(login);
			button.click();
			this.passForm=driver.findElement(params.passForm);
			passForm.sendKeys(password);
			driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/input[1]")).click();
			return new MainPage(driver, params);
			
		}
		
		else{
			this.loginForm=driver.findElement(params.loginForm);
			this.passForm=driver.findElement(params.passForm);
			this.button=driver.findElement(params.loginButton);
		loginForm.sendKeys(login);
		passForm.sendKeys(password);
		button.click();
		return new MainPage(driver, params);
	}
	}
}
