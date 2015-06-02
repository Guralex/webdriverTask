package tests;

import static org.junit.Assert.*;
import iUaPages.IuaCreatePage;
import iUaPages.IuaDraftsPage;
import iUaPages.IuaLoginPage;
import iUaPages.IuaMainPage;
import iUaPages.IuaSentPage;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class IuaTest extends BaseTest {



	public IuaLoginPage loginpage;
	public IuaMainPage main;
	public IuaCreatePage create;
	public IuaDraftsPage chern;
	public IuaSentPage sent;

	public String emailAdress = "sanya_gura@mail.ru";
	public String emailSubject = "hi";
	public String emailText = "Hello, my friend!!";



	@Test
	public void test() {

		driver.get("http://mail.i.ua/");
		
		loginpage = new IuaLoginPage(driver);
		main = loginpage.login("sanya_gura", "serenity");
		create = main.goToCreate();
		assertTrue("We are NOT on the Create Letter Page",driver.getTitle().contains("Новое"));
		
		main = create.saveLetter(emailAdress, emailSubject, emailText);
		chern = main.goToChern();
		assertTrue("The letter is NOT in the list of drafts",chern.firstMail.getText().contains(emailAdress));
		
		create = chern.firstMail();
		assertEquals("The letter is NOT one, that we sent",create.addr.getText(), emailAdress);
		
		main = create.sendLetter();
		chern = main.goToChern();
		assertFalse("The letter is NOT removed from drafts",chern.firstMail.getText().contains(emailAdress));
		
		sent = chern.goToSent();
		assertTrue("The letter is NOT in Sent folder",sent.firstSent.getText().contains(emailAdress));
		
		sent.gotoExit();

	}

}
