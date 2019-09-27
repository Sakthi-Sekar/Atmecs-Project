package com.atmecs.testscripts.scenario1;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.org.atmecs.testbase.InvokeBrowser;
import com.org.atmecs.utils.PageActions;
import com.org.atmecs.utils.ValidateTestResult;

public class ServicesContext extends InvokeBrowser {
	@Test(priority = 18)
	//To click on services
	public void ClickOnServices() {
		Xpath = read.readPropertiesFile("loc.homepage.Service.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on services");
	}

	@Test(priority = 19)
	//context validation for services-digital life
	public void ValidateDigitalLifeContext() {
		Xpath = read.readPropertiesFile("loc.services.digitallife.xpath");
		String digitallife = driver.findElement(By.xpath(Xpath)).getText();
		PageActions.clickOnElement(driver, Xpath);
		ValidateTestResult.validateData(digitallife, "Digital Life", "match found");
		System.out.println("Digital Life subtitle match found");

		Xpath = read.readPropertiesFile("loc.digitallife.ai/ml.xpath");
		String aiml = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(aiml, "Artificial Intelligence / Machine Learning", "Match found");
		System.out.println("Match found");

		Xpath = read.readPropertiesFile("loc.digitallife.blockchain.xpath");
		String bc = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(bc, "Blockchain", "Match found");
		System.out.println("Match found");

		Xpath = read.readPropertiesFile("loc.digitallife.iot.xpath");
		String iot = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(iot, "Internet of Things", "Match found");
		System.out.println("Match found");
		log.info("COntext validation for Digital Life is done");
	}

	@Test(priority = 20)
	public void ClickServices() {
		Xpath = read.readPropertiesFile("loc.homepage.Service.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on services");
	}

	@Test(priority = 21)
	//context validation for services-infrastructure services
	public void ValidateInfrastructureServicesContext() {
		Xpath = read.readPropertiesFile("loc.services.is.xpath");
		String ins = driver.findElement(By.xpath(Xpath)).getText();
		PageActions.clickOnElement(driver, Xpath);
		ValidateTestResult.validateData(ins, "Infrastructure Services", "match found");
		System.out.println("Match found");

		Xpath = read.readPropertiesFile("loc.is.ismanagement.xpath");
		String ism = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(ism, "Infrastructure Management", "Match found");
		System.out.println("Match found");

		Xpath = read.readPropertiesFile("loc.is.cloudmanagement.xpath");
		String cm = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(cm, "Cloud Management", "Match found");
		System.out.println("Match found");

		Xpath = read.readPropertiesFile("loc.is.devops.xpath");
		String devops = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(devops, "Devops", "Match found");
		System.out.println("Match found");

		Xpath = read.readPropertiesFile("loc.is.noc.xpath");
		String noc = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(noc, "NOC Services", "Match found");
		System.out.println("Match found");

		Xpath = read.readPropertiesFile("loc.is.dcm.xpath");
		String dcm = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(dcm, "Data Center Management", "Match found");
		System.out.println("Match found");
		log.info("Context validation is done for Infrastructure Services is done");
	}

}
