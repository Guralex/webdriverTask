package pageObjects;

import org.openqa.selenium.By;

public class Params {

	String type;
	By loginButton;
	By loginForm;
	By passForm;
	By createMessage;
	By chernovik;

	By saveButton;
	By sendButton;
	By toForm;
	By themeForm;

	By textForm;
	By firstMail;

	By sentLink;
	By firstSent;

	By exitButton;
	By exitMenu;

	private Params(String site) {
		this.type = site;
		switch (site) {

		

		case "yandex": {
			loginButton = By
					.xpath("//button/span[@class='_nb-button-content']");
			loginForm = By.name("login");
			passForm = By.name("passwd");

			createMessage = By.xpath(".//a[contains(@href,'compose')]");

			chernovik = By.xpath(".//a[contains(@title,'Черновики')]");

			saveButton = By.id("nb-22");
			sendButton = By.xpath("//*[@id='compose-submit']");
			toForm = By.className("b-mail-input_yabbles__focus");
			themeForm = By.id("compose-subj");

			textForm = By.xpath("//textarea[@name='send']");
			firstMail = By
					.xpath(".//*[@id='js-page']/div/div[5]/div/div[3]/div/div[3]/div/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/span[2]/span/a/span[2]/span/span");

			sentLink = By.xpath(".//a[contains(@href,'sent')]");
			firstSent = By
					.xpath("//*[@id='js-page']/div/div[5]/div/div[3]/div/div[3]/div/div/div/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/span[2]/span/a/span[1]/span/span[2]");

			exitMenu = By.xpath("//a[@id='nb-1']");
			exitButton = By.xpath(".//a[contains(@href,'logout')]");

			break;
		}

		case "google": {
			loginButton = By
					.xpath("/html/body/div/div[2]/div[2]/div[1]/form/div[1]/div/input");
			loginForm = By
					.xpath("/html/body/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]");
			passForm = By
					.xpath("/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]");

			createMessage =By.xpath("//div[@gh='cm']");

			chernovik =By.xpath(".//*[contains(@href,'drafts')]");

			saveButton =By.xpath(".//*[@aria-label='Сохранить и закрыть']");
			sendButton = By.xpath("//div[text()='Отправить']");
			toForm =By.xpath(".//*[@aria-label='Кому']");
			themeForm = By.name("subjectbox");
			// final By textForm = By.name("body");
			textForm = By.xpath("//*[@role='textbox']");
			firstMail = By
					.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div[4]/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/span[1]");

			sentLink = By.xpath(".//*[contains(@href,'sent')]");
			firstSent = By
					.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div[4]/div[1]/div/table/tbody/tr/td[6]/div/div/div/span[1]");

			exitMenu = By.xpath(".//a[contains(@href,'me?tab')]");
			exitButton = By.xpath(".//a[contains(@href,'logout')]");

			break;
		}

		}

	};

	private static Params instance = null;

	public static synchronized Params getInstance(String site) {
		if (instance == null)
			instance = new Params(site);
		return instance;
	}

}
