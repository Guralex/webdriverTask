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

	
public ChernPage loginPlusSaveForGoogle(String login, String password, String addr, String subj,String text){
		
		this.loginForm=driver.findElement(params.loginForm);
		this.button=driver.findElement(params.loginButton);
		loginForm.sendKeys(login);
		button.click();
		this.passForm=driver.findElement(params.passForm);
		passForm.sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		driver.findElement(By.xpath(".//*[@aria-label='Кому']")).sendKeys(addr);
		driver.findElement(By.name("subjectbox")).sendKeys(subj);
		driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys(text);
		driver.findElement(By.xpath(".//*[@aria-label='Сохранить и закрыть']")).click();
		driver.findElement(By.xpath(".//*[contains(@href,'drafts')]")).click();
		
		return new ChernPage(driver,params);
	}
	

		
	
	public MainPage login(String login, String password){
	
			this.loginForm=driver.findElement(params.loginForm);
			this.passForm=driver.findElement(params.passForm);
			this.button=driver.findElement(params.loginButton);
		loginForm.sendKeys(login);
		passForm.sendKeys(password);
		button.click();
		return new MainPage(driver, params);
	
		
		
		
	}
}
