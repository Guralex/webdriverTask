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

public class GoogleTest {

	static WebDriver driver;
	static Params params = Params.getInstance("google");

	public LoginPage loginpage;
	public MainPage main;
	public CreatePage create;
	public DraftsPage chern;
	public SentPage sent;

	public String testAddr = "sanya_gura@mail.ru";
	public String testSubj = "hi";
	public String testText = "Hello, my friend!!";

	@BeforeClass
	public static void start() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*
	 * @AfterClass public static void close(){ driver.quit();
	 * 
	 * }
	 */

	@Test
	public void test() {

		driver.get("http://mail.google.com");
		loginpage = new LoginPage(driver, params);
		chern = loginpage.loginPlusSaveForGoogle("serenity3837@gmail.com",
				"guralex3837", testAddr, testSubj, testText);
		assertTrue(chern.firstMail.getText().contains(testSubj));
		chern.firstMailGoogle();
		sent = chern.goToSent();
		assertEquals(testSubj, sent.firstSent.getText());
		sent.gotoExit();

	}

}