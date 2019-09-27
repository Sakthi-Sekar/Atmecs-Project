package com.atmecs.testscripts.scenario1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.org.atmecs.utils.PageActions;
import com.org.atmecs.utils.ValidateTestResult;

public class Partners extends Services {
	@Test(priority = 8)
	//to click on partners
	public void ClickOnPartners() {
		Xpath = read.readPropertiesFile("loc.homepage.Partners.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on Partners");
	}

	@Test(priority = 9)
	//to validate footer for partners
	public void ValidateFooterPartners() {
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
		log.info("Footer validation for partners is done");
	}
}
