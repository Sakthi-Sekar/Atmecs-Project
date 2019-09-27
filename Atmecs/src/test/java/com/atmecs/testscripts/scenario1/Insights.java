package com.atmecs.testscripts.scenario1;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.org.atmecs.utils.PageActions;
import com.org.atmecs.utils.ValidateTestResult;

public class Insights extends Media {
	@Test(priority = 12)
	// to click on insights
	public void ClickOnInsights() {
		Xpath = read.readPropertiesFile("loc.homepage.Insights.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on Insights");
	}

	@Test(priority = 13)
	// to validate footer for insights
	public void ValidateFooterInsights() {
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
		log.info("Footer validation for Insights is done");
	}

//Validate Date difference 
	@Test(priority = 14)
	public void DateDiff() {

		LocalDate today = LocalDate.now();
		System.out.println(today);
		// subtracting months from Date

		LocalDate previousDate = LocalDate.now().minusMonths(3);
		System.out.println("date before 3 months : " + previousDate);
		long p2 = ChronoUnit.DAYS.between(previousDate, today);

		System.out.println("days total" + p2);
	}
}
