package com.atmecs.testscripts.scenario1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.org.atmecs.utils.PageActions;
import com.org.atmecs.utils.ValidateTestResult;

public class Media extends Partners {
	@Test(priority = 10)
	//to click on media
	public void ClickOnMedia() {
		Xpath = read.readPropertiesFile("loc.homepage.Media.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on Media");
	}

	@Test(priority = 11)
	//validate footer for media
	public void ValidateFooterMedia() {
		Xpath = read.readPropertiesFile("loc.homepage.sitemap.xpath");
		String sitemap = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(sitemap, "Sitemap", "Sitemap matches");
		System.out.println("Sitemap matched");
		// Validation for footer-Services
		Xpath = read.readPropertiesFile("loc.homepage.services.xpath");
		String services = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(services, "Services", "Matches");
		System.out.println("Services matched");
		// validation for footer-Careers
		Xpath = read.readPropertiesFile("loc.homepage.careers.xpath");
		String careers = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(careers, "Careers", "Careers matches");
		System.out.println("Careers matched");
		// validation for footer-contactus
		Xpath = read.readPropertiesFile("loc.homepage.contactus.xpath");
		String contactus = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(contactus, "Contact Us", "Contactus matches");
		System.out.println("Contact us matched");
		log.info("Footer validation for Media is done ");
	}
}
