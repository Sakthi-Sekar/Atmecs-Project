package com.atmecs.testscripts.scenario2;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.org.atmecs.testbase.InvokeBrowser;
import com.org.atmecs.utils.PageActions;
import com.org.atmecs.utils.ValidateTestResult;

public class InsightBlogs extends InvokeBrowser {

	String value;

	@Test(priority = 2)
	// To click on Insights
	public void ClickOnInsights() {
		Xpath = read.readPropertiesFile("loc.homepage.Insights.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on Insights");
	}

	@Test(priority = 3)
	// to click on blogs
	public void ClickOnBlogs() {
		Xpath = read.readPropertiesFile("loc.insights.blogs.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on Blogs");
	}

	@Test(priority = 4)
	// To click on blog image
	public void ClickBlogImageLink() {
		Xpath = read.readPropertiesFile("loc.blogs.clicklinkonAI.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked onto the selected blog");
	}

	@Test(priority = 5)
	// validate breadcrumb
	public void ValidateBreadcrumb() {
		Xpath = read.readPropertiesFile("loc.blog.breadcrumb.xpath");
		String breadcrumb = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(breadcrumb, "Home › AI › Debunking Myths about AI", "Match found");
		System.out.println("Match found");
		log.info("Breadcrumb validation is done");
    //validate blog title
		Xpath = read.readPropertiesFile("loc.blog.title.xpath");
		String title = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(title, "Debunking Myths about AI", "Title matches");
		System.out.println("Match found");
		log.info("Title validation is done");
	}

	@Test(priority = 6)
	// validate blog date
	public void ValidateDate() {

		Xpath = read.readPropertiesFile("loc.blog.date.xpath");
		String date = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(date, "March 15, 2019", "Match found");
		System.out.println("Match found");
		log.info("Date validation is done");
	}

	@Test(priority = 7)
	// validate blog content
	public void ValidateContent() {
		Xpath = read.readPropertiesFile("loc.blog.content.xpath");
		String content = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(content, value, "Matches");
		System.out.println("Match found");
		log.info("Content validation is done");

	}

	@Test(priority = 8)
	// to click on post comment
	public void CLickOnPostComment() {
		Xpath = read.readPropertiesFile("loc.blog.postcomment.xpath");
		PageActions.clickOnElement(driver, Xpath);
		log.info("Clicked on Post Comment");

	}

	@Test(priority = 9)
	// validate error message
	public void ValidateErrorMessage() {
		Xpath = read.readPropertiesFile("loc.blog.errormsg.xpath");
		String error = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(error, "Please fill out this field", "Matches");
		System.out.println("Error message displayed as Please fill out this field");
	}

}
