package com.vtiger.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility4;

public class OrganizationInformationPage5 extends WebDriverUtility4 {
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement OrgHeaderText;

		public OrganizationInformationPage5 (WebDriver driver) //test script
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getOrgHeaderText() {
			return OrgHeaderText;
		}
		//Business Library
		public String getHeader()
		{
			return OrgHeaderText.getText();
		}
}