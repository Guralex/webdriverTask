package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage extends Page{
	
	
	public WebElement save;
	
	public WebElement send;
		
	public WebElement addr;
	
	public WebElement text;
	
	public WebElement title;
		
	static Params params=Params.getInstance();
	CreatePage(WebDriver driver){
		this.driver=driver;
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
		return new MainPage(driver);
	}
	
	public MainPage sendLetter(){
		send.click();
		
		return new MainPage(driver);
	}

}
