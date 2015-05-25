package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SentPage extends Page{
	static Params params=Params.getInstance();
	 WebElement firstSent;
	private WebElement exitButton;
	SentPage(WebDriver driver){
		this.driver=driver;
		firstSent = driver.findElement(params.firstSent);		
	}
	
	public void gotoExit(){
		exitButton = driver.findElement(params.exitButton);
		exitButton.click();
		
	}
}
