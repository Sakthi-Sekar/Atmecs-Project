package com.atmecs.testscripts.scenario1;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.org.atmecs.helpers.Validation;
import com.org.atmecs.utils.PageActions;
import com.org.atmecs.utils.ValidateTestResult;

public class ContactUs extends Careers {
	Validation validate = new Validation();

	@Test(priority = 16)
	// To click on contactus
	public void ClickOnContactUs() {
		Xpath = read.readPropertiesFile("loc.homepage.ContactUs.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on Contact us");
	}

	@Test(priority = 17)
	// Footer validation for sitemap
	public void ValidateFooterContactUs() {

		Xpath = read.readPropertiesFile("loc.homepage.sitemap.xpath");
		String sitemap = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(sitemap, "Sitemap", "Sitemap matches");
		System.out.println("Sitemap matched"); // Validation for footer-Services
		Xpath = read.readPropertiesFile("loc.homepage.services.xpath");
		String services = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(services, "Services", "Matches");
		System.out.println("Services matched"); // validation for footer-Careers
		Xpath = read.readPropertiesFile("loc.homepage.careers.xpath");
		String careers = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(careers, "Careers", "Careers matches");
		System.out.println("Careers matched"); // validation for footer-contactus
		Xpath = read.readPropertiesFile("loc.homepage.contactus.xpath");
		String contactus = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(contactus, "Contact Us", "Contactus matches");
		System.out.println("Contact us matched");
		log.info("Footer validation for Contact us is done");

	}
}
