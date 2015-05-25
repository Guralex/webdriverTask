package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SentPage extends Page{
	Params params;
	 WebElement firstSent;
	private WebElement exitButton;
	SentPage(WebDriver driver, Params par){
		this.driver=driver;
		this.params = par;
		firstSent = driver.findElement(params.firstSent);		
	}
	
	public void gotoExit(){
		exitButton = driver.findElement(params.exitButton);
		exitButton.click();
		
	}
}
