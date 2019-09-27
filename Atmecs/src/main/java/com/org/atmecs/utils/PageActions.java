package com.org.atmecs.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageActions {
	protected static WebDriver driver;

	public static void clickOnElement(WebDriver driver, String xpath) {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).click();

	}

}
