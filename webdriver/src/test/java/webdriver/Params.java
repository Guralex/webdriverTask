package webdriver;

import org.openqa.selenium.By;

public class Params {

	 String type;
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
		this.type = site;
		switch(site){
		
		case "i.ua":{
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
			
			break;
		}
		
		case "yandex":{
			loginButton = By.xpath("//*[@id='js']/body/div[1]/div[1]/div[1]/form/div[4]/span/button");
			loginForm = By.name("login");
			passForm = By.name("passwd");
			
			createMessage = By.xpath("//*[@id='js-page']/div/div[5]/div/div[3]/div/div[2]/div/div/div/div[2]/a[2]");
			
			chernovik = By.xpath("//*[@id='js-page']/div/div[5]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[5]/span[2]/a");
			
			saveButton = By.id("nb-22");
			sendButton = By.xpath("//*[@id='compose-submit']");
			toForm = By.className("b-mail-input_yabbles__focus");
			themeForm = By.id("compose-subj");
			//final By textForm = By.name("body");
			textForm =By.xpath("/html/body/div[2]/div/div[5]/div/div[3]/div/div[3]/div/div/div/div[2]/div/div/form/div/div[2]/div[2]/textarea");
			firstMail = By.xpath("//*[@id='js-page']/div/div[5]/div/div[3]/div/div[3]/div/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[1]/span[2]/span/a/span[2]/span/span");
				
			sentLink = By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a");
			firstSent =By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div[2]/form/div/a/span[2]");
			exitButton =By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[7]/a");
			break;
		}
		
		
		}
		
		
	};
	private static Params instance=null;
	public static synchronized Params getInstance(String site){ 
		if(instance == null)
			instance =new Params(site);
		return instance;
	}
	

}
