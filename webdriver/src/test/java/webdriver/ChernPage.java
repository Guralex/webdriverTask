package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChernPage {
	Params params;
	private WebDriver driver;
	
	WebElement firstMail;
	WebElement sentLink;

	ChernPage(WebDriver driver, Params par){
		this.driver=driver;
		this.params=par;
		if(driver.findElements(params.firstMail).size()!=0)
		firstMail = driver.findElement(params.firstMail);
		
	}
	
	public CreatePage firstMail(){
		
		firstMail.click();
		return new CreatePage(driver,params);
	}
	
	public SentPage goToSent(){
		
		sentLink = driver.findElement(params.sentLink);
		sentLink.click();
		
		return new SentPage(driver,params);
	}
	
	public void firstMailGoogle(){
		
		firstMail.click();
		driver.findElement(By.xpath("//div[text()='Отправить']"));
	}
	
}
