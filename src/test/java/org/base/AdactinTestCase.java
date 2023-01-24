package org.base;

import org.openqa.selenium.WebElement;

public class AdactinTestCase extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		browserLaunch("https://www.facebook.com/");

		PageObjectModel v = new PageObjectModel();

		WebElement username = v.getUsername();
		username.sendKeys("Iloveyou");
		v.getPassword().sendKeys("8778g");
		v.getLogin().click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
