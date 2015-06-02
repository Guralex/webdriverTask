package tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;







import pageObjects.CreatePage;
import pageObjects.DraftsPage;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.Params;
import pageObjects.SentPage;
import yandexPages.YandexCreatePage;
import yandexPages.YandexDraftsPage;
import yandexPages.YandexLoginPage;
import yandexPages.YandexMainPage;
import yandexPages.YandexSentPage;

public class YandexTest extends BaseTest{




	public YandexLoginPage loginpage;
	public YandexMainPage main;
	public YandexCreatePage create;
	public YandexDraftsPage chern;
	public YandexSentPage sent;

	public String testAddr = "sanya_gura@mail.ru";
	public String testSubj = "hi";
	public String testText = "Hello, my friend!!";

	

	@Test
	public void test() {

		driver.get("https://mail.yandex.ua/");
		loginpage = new YandexLoginPage(driver);
		main = loginpage.login("serenity3837", "serenity");
		create = main.goToCreate();
		main = create.saveLetter(testAddr, testSubj, testText);

		chern = main.goToChern();

		create = chern.firstMail();

		main = create.sendLetter();

		sent = chern.goToSent();

		sent.gotoExit();

	}

}
