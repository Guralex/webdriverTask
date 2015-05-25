package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page {
	
	
	public WebElement create;
		
	public WebElement chern;
		
	public WebElement sent;
	Params params;
	
	MainPage(WebDriver driver,Params params){
		this.driver=driver;
		this.params=params;
		create = driver.findElement(params.createMessage);
		

		
	}
	
	
	public CreatePage goToCreate(){
		
		
		create.click();
		return new CreatePage(driver, params);
		
	}
	
	public ChernPage goToChern(){
		
		chern = driver.findElement(params.chernovik);
		chern.click();
		
		return new ChernPage(driver, params);
	}
	
	public SentPage goToSent(){
		
		chern = driver.findElement(params.chernovik);
		chern.click();
		
		return new SentPage(driver,params);
	}
	
}
