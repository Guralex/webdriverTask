package tests;

import static org.junit.Assert.*;
import googlePages.GoogleDraftsPage;
import googlePages.GoogleLoginPage;
import googlePages.GoogleSentPage;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest extends BaseTest {

	public GoogleLoginPage loginpage;
	public GoogleDraftsPage chern;
	public GoogleSentPage sent;

	public String emailAdress = "sanya_gura@mail.ru";
	public String emailSubject = "hi";
	public String emailText = "Hello, my friend!!";
	public String login = "serenity3837@gmail.com";
	public String password = "guralex3837";
	

	@Test
	public void test() {

		driver.get("http://mail.google.com");
		loginpage = new GoogleLoginPage(driver);
		chern = loginpage.loginPlusSaveForGoogle(login,
				password, emailAdress, emailSubject, emailText);
		assertTrue("The letter is NOT in the list of drafts",chern.firstMail.getText().contains(emailSubject));
		chern.firstMailGoogle();
		assertFalse("The letter is NOT removed from drafts", chern.firstMail
				.getText().contains(emailSubject));
		sent = chern.goToSent();
		assertTrue("The letter is NOT in Sent folder", sent.firstSent.getText()
				.contains(emailSubject));
		 sent.gotoExit();

	}

}
