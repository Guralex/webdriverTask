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






public class GoogleTest extends BaseTest{

	
	
	public GoogleLoginPage loginpage;
	public GoogleDraftsPage chern;
	public GoogleSentPage sent;

	public String testAddr = "sanya_gura@mail.ru";
	public String testSubj = "hi";
	public String testText = "Hello, my friend!!";



	@Test
	public void test() {

		driver.get("http://mail.google.com");
		loginpage = new GoogleLoginPage(driver);
		chern = loginpage.loginPlusSaveForGoogle("serenity3837@gmail.com",
				"guralex3837", testAddr, testSubj, testText);
		assertTrue(chern.firstMail.getText().contains(testSubj));
		chern.firstMailGoogle();
		//sent = chern.goToSent();
		//assertEquals(testSubj, sent.firstSent.getText());
		//sent.gotoExit();

	}

}
