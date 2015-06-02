package iUaPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IuaCreatePage  {

	WebDriver driver;
	
	@FindBy(name = "save_in_drafts")
	public WebElement save;

	@FindBy(name = "send")
	public WebElement send;

	@FindBy(name = "to")
	public WebElement addr;

	
	@FindBy(xpath = ".//*[@id='text']")
	public WebElement text;

	@FindBy(name = "subject")
	public WebElement title;

	
	IuaCreatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
			
	}

	public IuaMainPage saveLetter(String to, String subj, String body) {

		title.sendKeys(subj);
		addr.sendKeys(to);
		text.sendKeys(body);
		save.click();

		
		return new IuaMainPage(driver);
	}

	public IuaMainPage sendLetter() {
		send.click();

		return new IuaMainPage(driver);
	}

}
