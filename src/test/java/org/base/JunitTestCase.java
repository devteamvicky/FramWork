package org.base;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestCase extends BaseClass {

	@BeforeClass
	public static void testcase01() {

		browserLaunch("https://www.facebook.com/");
		System.out.println("BeforeClass");
	}

	@Before
	public void testcase02() {
		System.out.println("test Case @ before");
		String title = driver.getTitle();
		System.out.println(title);
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("Its Verified and contains = Facebook");
		Date date = new Date();
		System.out.println(date);

	}

	@Test
	public void testcase03() {
		System.out.println("test Case @ test");
		PageObjectModel a = new PageObjectModel();
		a.getUsername().sendKeys("IloveYou");
		a.getPassword().sendKeys("627fydeu78");
		a.getLogin().click();
	}

	@After
	public void testcase04() {
		System.out.println("test Case @ after");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl \t "+currentUrl);
		boolean contains = currentUrl.contains("VigneshTester");
		Assert.assertFalse(contains);
		System.out.println("Its not Match contains VigneshTester");
		Date date = new Date();
		System.out.println(date);

	}

	@AfterClass
	public static void testcase05() {
		System.out.println("test Case @ afterClass");
		driver.close();

	}
}
