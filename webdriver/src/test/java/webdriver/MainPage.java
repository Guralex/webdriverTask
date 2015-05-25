package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page {
	static Params params=Params.getInstance();
	
	public WebElement create;
		
	public WebElement chern;
		
	public WebElement sent;
	
	MainPage(WebDriver driver){
		this.driver=driver;

		create = driver.findElement(params.createMessage);
		

		
	}
	
	
	public CreatePage goToCreate(){
		
		
		create.click();
		return new CreatePage(driver);
		
	}
	
	public ChernPage goToChern(){
		
		chern = driver.findElement(params.chernovik);
		chern.click();
		
		return new ChernPage(driver);
	}
	
	public SentPage goToSent(){
		
		chern = driver.findElement(params.chernovik);
		chern.click();
		
		return new SentPage(driver);
	}
	
}
