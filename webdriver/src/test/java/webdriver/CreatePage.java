package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage extends Page{
	
	
	public WebElement save;
	
	public WebElement send;
		
	public WebElement addr;
	
	public WebElement text;
	
	public WebElement title;
	
	Params params;
		
	
	CreatePage(WebDriver driver, Params par){
		this.driver=driver;
		this.params=par;
		save = driver.findElement(params.saveButton);
		send = driver.findElement(params.sendButton);
		addr = driver.findElement(params.toForm);
		title = driver.findElement(params.themeForm);
		text = driver.findElement(params.textForm);
	}
	
	
	public MainPage saveLetter(String to,String subj,String body){
		
		title.sendKeys(subj);
		addr.sendKeys(to);
		text.sendKeys(body); 
		save.click();
		return new MainPage(driver,params);
	}
	
	public MainPage sendLetter(){
		send.click();
		
		return new MainPage(driver,params);
	}

}
