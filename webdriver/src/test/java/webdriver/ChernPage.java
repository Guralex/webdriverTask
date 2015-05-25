package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChernPage {
	static Params params=Params.getInstance();
	private WebDriver driver;
	
	WebElement firstMail;
	WebElement sentLink;

	ChernPage(WebDriver driver){
		this.driver=driver;
	
		if(driver.findElements(params.firstMail).size()!=0)
		firstMail = driver.findElement(params.firstMail);
		
	}
	
	public CreatePage firstMail(){
		
		firstMail.click();
		return new CreatePage(driver);
	}
	
	public SentPage goToSent(){
		
		sentLink = driver.findElement(params.sentLink);
		sentLink.click();
		
		return new SentPage(driver);
	}
	
}
