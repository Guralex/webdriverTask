package yandexPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexCreatePage  {

	WebDriver driver;
	
	@FindBy(id = "nb-22")
	public WebElement save;

	@FindBy(xpath = "//*[@id='compose-submit']")
	public WebElement send;

	@FindBy(className = "b-mail-input_yabbles__focus")
	public WebElement addr;

	
	@FindBy(xpath = "//textarea[@name='send']")
	public WebElement text;
	
	

	@FindBy(id = "compose-subj")
	public WebElement title;

	
	YandexCreatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
			
	}

	public YandexMainPage saveLetter(String to, String subj, String body) {

		title.sendKeys(subj);
		addr.sendKeys(to);
		text.sendKeys(body);
		save.click();

		
		driver.findElement(
					By.xpath("//*[@id='js']/body/div[6]/div[2]/table/tbody/tr/td/div[4]/button[1]"))
					.click();
		return new YandexMainPage(driver);
	}

	public YandexMainPage sendLetter() {
		send.click();

		return new YandexMainPage(driver);
	}

}
