package webdriver;

import org.openqa.selenium.By;

public class Params {

	
	 By loginButton ;
	 By loginForm ;
	 By passForm;
	 By createMessage ;
	 By chernovik ;
	
	
	 By saveButton ;
	 By sendButton ;
	 By toForm;
	 By themeForm ;

	 By textForm ;
	 By firstMail ;
	
	
	 By sentLink;
	 By firstSent;
	
	 By exitButton ;
	
	private Params(String site){
		if(site.equals("i.ua")){
			
		loginButton = By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[3]/form/ul/li[2]/input");
		loginForm = By.name("login");
		passForm = By.name("pass");
		createMessage = By.xpath("//p[@class='make_message']/a");
		chernovik = By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[2]/div[2]/div[3]/ul/li[3]/a");
		
		saveButton = By.name("save_in_drafts");
		sendButton = By.name("send");
		toForm = By.name("to");
		themeForm = By.name("subject");
		//final By textForm = By.name("body");
		textForm =By.xpath("/html/body/div[4]/div[5]/div[1]/div[1]/div[2]/textarea");
		firstMail = By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div[2]/form/div[1]");
			
		sentLink = By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a");
		firstSent =By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div[2]/form/div/a/span[2]");
		exitButton =By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[7]/a");
		}
	};
	private static Params instance=null;
	public static synchronized Params getInstance(String site){ 
		if(instance == null)
			instance =new Params(site);
		return instance;
	}
	

}
