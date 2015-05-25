package webdriver;

import org.openqa.selenium.By;

public class Params {

	
	final By loginButton = By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[3]/form/ul/li[2]/input");
	final By loginForm = By.name("login");
	final By passForm = By.name("pass");
	final By createMessage = By.xpath("//p[@class='make_message']/a");
	final By chernovik = By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[2]/div[2]/div[3]/ul/li[3]/a");
	
	
	final By saveButton = By.name("save_in_drafts");
	final By sendButton = By.name("send");
	final By toForm = By.name("to");
	final By themeForm = By.name("subject");
	//final By textForm = By.name("body");
	final By textForm =By.xpath("/html/body/div[4]/div[5]/div[1]/div[1]/div[2]/textarea");
	final By firstMail = By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div[2]/form/div[1]");
	
	
	final By sentLink = By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a");
	final By firstSent =By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div[2]/form/div/a/span[2]");
	
	final By exitButton =By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[7]/a");
	
	private Params(){};
	private static Params instance=null;
	public static synchronized Params getInstance(){ 
		if(instance == null)
			instance =new Params();
		return instance;
	}
	

}
