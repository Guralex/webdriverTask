package webdriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IuaTest {
	
	static WebDriver driver;
	static Params params=Params.getInstance("i.ua");
	
	public LoginPage loginpage;
	public MainPage main;
	public CreatePage create;
	public ChernPage chern;
	public SentPage sent;
	
	
	
	public String testAddr = "sanya_gura@mail.ru";
	public String testSubj = "hi";
	public String testText="Hello, my friend!!";
	
	@BeforeClass
	public static void start(){
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void close(){
	driver.close();
		
	}

	@Test
	public void test() {
		
		driver.get("http://mail.i.ua/");
				
		loginpage = new LoginPage(driver,params);
		main = loginpage.login("sanya_gura", "serenity");
		create = main.goToCreate();
		assertTrue(driver.getTitle().contains("Новое"));
		main = create.saveLetter(testAddr, testSubj,testText);
		chern = main.goToChern();
		
		assertTrue(chern.firstMail.getText().contains(testAddr));
	
		create = chern.firstMail();
		
		assertEquals(create.addr.getText(),testAddr);
		main =create.sendLetter();
		chern = main.goToChern();
		assertTrue(chern.firstMail==null);
		sent = chern.goToSent();
		assertTrue(sent.firstSent.getText().contains(testAddr));
		/*sent.gotoExit();
		assertTrue(driver.getTitle().contains("Твоя почта"));*/
		
	}
	
	

	
}
