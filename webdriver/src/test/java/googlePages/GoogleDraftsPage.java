package googlePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleDraftsPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div[4]/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/span[1]")
	public WebElement firstMail;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div[4]/div[1]/div/table/tbody/tr/td[6]/div/div/div/span[1]")
	public WebElement sentLink;
	
	@FindBy(xpath="//div[text()='Отправить']")
	public WebElement send;
	
	@FindBy(xpath=".//*[contains(@href,'drafts')]")
	public WebElement chern;

	GoogleDraftsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		
	}

	

	public GoogleSentPage goToSent() {

		
		sentLink.click();

		return new GoogleSentPage(driver);
	}

	public void firstMailGoogle() {

		firstMail.click();
		send.click();
		chern.click();

	}
	

}
