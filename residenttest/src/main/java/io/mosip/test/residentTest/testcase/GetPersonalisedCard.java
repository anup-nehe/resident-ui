package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class GetPersonalisedCard extends BaseClass {
	
	@Test(groups = "GPC")
	public void GetPersonalisedCard() throws Exception {
		LoginTest.loginTest();
		test=extent.createTest("Get Personalised Card", "verify Login");
		Commons.click(test,driver, By.xpath("(//mat-card[@class='mini-card mat-card'])[5]"));
		
		Commons.click(test,driver, By.xpath("//span[text()='Name']"));
		Commons.click(test,driver, By.xpath("//span[text()='DOB']"));
		Commons.click(test,driver, By.xpath("//span[text()='UIN']"));
		
		Commons.click(test,driver, By.id("downloadFileBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on download");
		
		Commons.click(test,driver, By.xpath("//span[text()='Name']"));
		Commons.click(test,driver, By.xpath("//span[text()='DOB']"));
		Commons.click(test,driver, By.xpath("//span[text()='Perpetual VID']"));
		Commons.click(test,driver, By.xpath("//span[text()='Phone Number']"));
		
		Commons.click(test,driver, By.id("Mask It2"));
		Commons.click(test,driver, By.id("Mask It3"));
		Commons.click(test,driver, By.id("Mask It4"));
		Commons.click(test,driver, By.id("downloadFileBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		
		test.log(Status.INFO, "Submit with any three checkbox with masked  ");
		Commons.click(test,driver, By.xpath("//span[text()='Name']"));
		Commons.click(test,driver, By.xpath("//span[text()='DOB']"));
		
		Commons.click(test,driver, By.id("downloadFileBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Thread.sleep(3000);

		Commons.click(test,driver, By.id("Mask It2"));
		Commons.click(test,driver, By.id("Mask It3"));
		Commons.click(test,driver, By.id("Mask It4"));
		Commons.click(test,driver, By.id("downloadFileBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));

		Commons.click(test,driver, By.xpath("//span[text()='Email ID']"));
		Commons.click(test,driver, By.xpath("//span[text()='Address']"));
		Commons.click(test,driver, By.xpath("//span[text()='Gender']"));
		Commons.click(test,driver, By.xpath("//span[text()='Image']"));
		Commons.click(test,driver, By.id("downloadFileBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Select all check box");
		Commons.click(test,driver, By.id("Mask It2"));
		Commons.click(test,driver, By.id("Mask It3"));
		Commons.click(test,driver, By.id("Mask It4"));
		Commons.click(test,driver, By.id("Mask It5"));
		test.log(Status.INFO, "Select all checbox masked");
		Commons.click(test,driver, By.id("downloadFileBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Submit");
	}
	

}