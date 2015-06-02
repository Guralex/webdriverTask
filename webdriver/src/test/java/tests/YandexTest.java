package tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import yandexPages.YandexCreatePage;
import yandexPages.YandexDraftsPage;
import yandexPages.YandexLoginPage;
import yandexPages.YandexMainPage;
import yandexPages.YandexSentPage;

public class YandexTest extends BaseTest {

	public YandexLoginPage loginpage;
	public YandexMainPage main;
	public YandexCreatePage create;
	public YandexDraftsPage chern;
	public YandexSentPage sent;

	public String emailAdress = "sanya_gura@mail.ru";
	public String emailSubject = "hi";
	public String emailText = "Hello, my friend!!";
	public String emailTargetname = "Alexander Gura";

	@Test
	public void test() {

		driver.get("https://mail.yandex.ua/");
		loginpage = new YandexLoginPage(driver);
		main = loginpage.login("serenity3837", "serenity");
		create = main.goToCreate();

		main = create.saveLetter(emailAdress, emailSubject, emailText);

		chern = main.goToChern();
		assertEquals("The letter is NOT in the list of drafts",
				chern.firstMail.getText(), emailTargetname);

		create = chern.firstMail();
		// assertEquals("The letter is NOT one, that we sent",create.addr.getText(),
		// emailAdress);

		main = create.sendLetter();

		sent = chern.goToSent();
		assertTrue("The letter is NOT in Sent folder", sent.firstSent.getText()
				.contains(emailTargetname));

		sent.gotoExit();

	}

}
