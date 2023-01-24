package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends BaseClass {

	public PageObjectModel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement userName;
	@FindBy(id = "pass")
	private WebElement passWord;
	@FindBy(name = "login")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}

}
