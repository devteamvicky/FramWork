package org.stepdefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	static Logger logger = Logger.getLogger(StepDefinition.class);

	@Given("user launch the valid facebook login url")
	public void user_launch_the_valid_facebook_login_url() {
		logger.info("Enetering Facebook_Url ");
		browserLaunch("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		logger.info(currentUrl);
		System.out.println("Browser Launching current Url = " + currentUrl);
		String title = driver.getTitle();
		logger.info(title);
		System.out.println("Browser Launching current title = " + title);
		logger.info("Hi..vicky..Welecome ..finally Acheived....................");
		logger.info("***********************FaceBook Url Launched*******************************");

	}

	@When("user enter valid userName {string} and passWord {string}")
	public void user_enter_valid_userName_and_passWord(String string, String string2) {
		PageObjectModel a = new PageObjectModel();
		sendText(a.getUserName(), string);
		sendText(a.getPassWord(), string2);
		logger.info("******************************Entering Username and password***********************************");

		WebElement userName = a.getUserName();
		String attribute3 = userName.getAttribute("value");
		logger.info("UserName : \t " + attribute3);

		WebElement passWord = a.getPassWord();
		String attribute2 = passWord.getAttribute("value");
		logger.info("PassWord : \t " + attribute2);

	}

	@When("user click the facbook loginButton")
	public void user_click_the_facbook_loginButton() {
		PageObjectModel a = new PageObjectModel();
		buttonClick(a.getLogin());
		logger.info("******************************Button Logging Click********************************************");
	}

	@Then("validation userName and passWord and navigation to user homePage")
	public void validation_userName_and_passWord_and_navigation_to_user_homePage() {
		String currentUrl = driver.getCurrentUrl();
		logger.info("Browser after current Url = " + currentUrl);
		System.out.println("Browser after current Url = " + currentUrl);
		String title = driver.getTitle();
		logger.info("Browser Launching after title = " + title);
		System.out.println("Browser Launching after title = " + title);
		System.out.println("page sucessFully automations on cucumber");
		logger.info(
				"************************************Validate username password and Checking Dashboard*****************************************************");

		driver.close();

	}

}
