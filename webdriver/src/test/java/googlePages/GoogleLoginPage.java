package googlePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GoogleLoginPage {
	
	WebDriver driver;
	
	

	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]")
	public WebElement loginForm;

	@FindBy(xpath="/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]")
	public WebElement passForm;
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div[1]/form/div[1]/div/input")
	public WebElement button;

	@FindBy(xpath = ".//*[@aria-label='Сохранить и закрыть']")
	public WebElement save;

	@FindBy(name = "send")
	public WebElement send;

	@FindBy(xpath = ".//*[@aria-label='Кому']")
	public WebElement addr;

	
	@FindBy(xpath = "//*[@role='textbox']")
	public WebElement text;

	@FindBy(name = "subjectbox")
	public WebElement title;
	@FindBy(xpath="//div[@gh='cm']")
	public WebElement create;

	@FindBy(xpath=".//*[contains(@href,'drafts')]")
	public WebElement chern;


	
	

	public GoogleLoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		

	}

	

	public GoogleDraftsPage loginPlusSaveForGoogle(String login, String password,
			String adress, String subj, String textMessage) {


		loginForm.sendKeys(login);
		button.click();
	
		passForm.sendKeys(password);
		driver.findElement(
				By.xpath("/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/input[1]"))
				.click();
		create.click();
		addr.sendKeys(adress);
		title.sendKeys(subj);
		text.sendKeys(textMessage);
		save.click();
		chern.click();

		return new GoogleDraftsPage(driver);
	}
}
